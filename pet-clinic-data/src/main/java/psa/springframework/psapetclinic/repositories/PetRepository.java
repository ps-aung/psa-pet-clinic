package psa.springframework.psapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import psa.springframework.psapetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
