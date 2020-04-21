/**
 * 
 */
package psa.springframework.psapetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import psa.springframework.psapetclinic.model.BaseEntity;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
public abstract class AbstractMapService <T extends BaseEntity,ID extends Long> {
	
	protected Map<Long, T> map = new HashMap<>();
	
	Set<T> findall(){
		return new  HashSet<>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T object) {
		if(object != null) {
			if(object.getId() == null) {
				object.setId(getNextId());
			}
			map.put(object.getId(), object);
		}else {
			throw new RuntimeException("Object Cannot be null");
		}
		
		return object;
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	private Long getNextId() {
		Long nextId = null; 
		try {
			nextId = Collections.max(map.keySet())+1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			nextId = 1L;
		}
		
		return nextId;
	}
	

}
