package psa.springframework.psapetclinic.services;

import java.util.Set;

import psa.springframework.psapetclinic.model.Vet;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet owner);
	
	Set<Vet> findall();

}
