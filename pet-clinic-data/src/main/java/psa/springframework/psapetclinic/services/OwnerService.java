/**
 * 
 */
package psa.springframework.psapetclinic.services;

import psa.springframework.psapetclinic.model.Owner;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
public interface OwnerService extends CrudServices<Owner, Long> {
	
	Owner findByLastName(String lastname);
	
}
