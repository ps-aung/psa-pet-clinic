package psa.springframework.psapetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.Visit;
import psa.springframework.psapetclinic.repositories.VisitRepository;
import psa.springframework.psapetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitSDJpaRepository implements VisitService  {
	
	private final VisitRepository visitRepository;
	
	public VisitSDJpaRepository(VisitRepository visitRepository) {
		// TODO Auto-generated constructor stub
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {
		// TODO Auto-generated method stub
		Set<Visit> visits = new HashSet<>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit object) {
		// TODO Auto-generated method stub
		return visitRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		// TODO Auto-generated method stub
		visitRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		visitRepository.deleteById(id);
	}

}
