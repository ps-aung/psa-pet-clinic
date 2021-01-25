package psa.springframework.psapetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.Owner;
import psa.springframework.psapetclinic.repositories.OwnerRepository;
import psa.springframework.psapetclinic.repositories.PetRepository;
import psa.springframework.psapetclinic.repositories.PetTypeRepository;
import psa.springframework.psapetclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {
	
	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	/**
	 * @param ownerRepository
	 * @param petRepository
	 * @param petTypeRepository
	 */
	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findall() {
		// TODO Auto-generated method stub
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		ownerRepository.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		ownerRepository.deleteById(id);
		
	}

	@Override
	public Owner findByLastName(String lastname) {
		// TODO Auto-generated method stub
		return ownerRepository.findByLastName(lastname);
	}

	@Override
	public List<Owner> findAllByLastNameLike(String lastName) {
		// TODO Auto-generated method stub
		return ownerRepository.findAllByLastNameLike(lastName);
	}

}
