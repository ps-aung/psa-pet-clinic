/**
 * 
 */
package psa.springframework.psapetclinic.services;

import java.util.Set;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
public interface CrudServices<T,ID> {
	
	Set<T> findall();
	
	T findById(ID id);
	
	T save(T object);
	
	void delete(T object);
	
	void deleteById(ID id);
	

}
