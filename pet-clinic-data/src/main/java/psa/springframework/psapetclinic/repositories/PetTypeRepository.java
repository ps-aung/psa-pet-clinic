package psa.springframework.psapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import psa.springframework.psapetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
