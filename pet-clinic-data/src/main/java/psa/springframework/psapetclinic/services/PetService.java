/**
 * 
 */
package psa.springframework.psapetclinic.services;

import java.util.Set;

import psa.springframework.psapetclinic.model.Pet;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet owner);
	
	Set<Pet> findall();
	

}
