/**
 * 
 */
package psa.springframework.psapetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.PetType;
import psa.springframework.psapetclinic.services.PetTypeService;

/**
 * Created by pyaesoneaung on 22/04/2020
 *
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public Set<PetType> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

}
