package psa.springframework.psapetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.Pet;
import psa.springframework.psapetclinic.repositories.PetRepository;
import psa.springframework.psapetclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
	
	private final PetRepository petRepository;
	
	public PetSDJpaService(PetRepository petRepository) {
		// TODO Auto-generated constructor stub
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return petRepository.save(object);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		petRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		petRepository.deleteById(id);
	}

}
