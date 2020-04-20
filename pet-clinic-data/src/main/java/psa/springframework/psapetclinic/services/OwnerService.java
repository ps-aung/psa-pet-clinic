/**
 * 
 */
package psa.springframework.psapetclinic.services;

import java.util.Set;

import psa.springframework.psapetclinic.model.Owner;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
public interface OwnerService {
	
	Owner findByLastName(String lastname);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findall();
	

}
