package psa.springframework.psapetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.Speciality;
import psa.springframework.psapetclinic.repositories.SpecialityRepository;
import psa.springframework.psapetclinic.services.SpecialtiesService;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialtiesService {

	private final SpecialityRepository specialityRepository;
	
	public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
		// TODO Auto-generated constructor stub
		this.specialityRepository = specialityRepository;
	}
	@Override
	public Set<Speciality> findAll() {
		// TODO Auto-generated method stub
		Set<Speciality> specialities = new HashSet<>();
		specialityRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		// TODO Auto-generated method stub
		return specialityRepository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		// TODO Auto-generated method stub
		specialityRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		specialityRepository.deleteById(id);
	}

}
