package psa.springframework.psapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import psa.springframework.psapetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
