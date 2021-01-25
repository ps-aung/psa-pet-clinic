package psa.springframework.psapetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.PetType;
import psa.springframework.psapetclinic.repositories.PetTypeRepository;
import psa.springframework.psapetclinic.services.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

	private final PetTypeRepository petTypeRepository;
	
	public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		// TODO Auto-generated constructor stub
		this.petTypeRepository = petTypeRepository;
	}
	@Override
	public Set<PetType> findall() {
		// TODO Auto-generated method stub
		Set<PetType> pettypes = new HashSet<>();
		petTypeRepository.findAll().forEach(pettypes::add);
		return pettypes;
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return petTypeRepository.save(object);
	}

	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub
		petTypeRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		petTypeRepository.deleteById(id);
	}

}
