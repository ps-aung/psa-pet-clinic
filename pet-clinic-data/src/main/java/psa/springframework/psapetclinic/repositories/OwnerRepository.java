package psa.springframework.psapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import psa.springframework.psapetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository< Owner, Long> {
	
	Owner findByLastName(String lastName);
}
