package psa.springframework.psapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import psa.springframework.psapetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
 
}
