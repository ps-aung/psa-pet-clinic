/**
 * 
 */
package psa.springframework.psapetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.Pet;
import psa.springframework.psapetclinic.services.PetService;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
@Service
@Profile({"default","map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {


	@Override
    public Set<Pet> findAll() {
        return super.findall();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
    	return super.save(object);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}
