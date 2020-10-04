package psa.springframework.psapetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import psa.springframework.psapetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
