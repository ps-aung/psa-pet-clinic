/**
 * 
 */
package psa.springframework.psapetclinic.services.map;

import java.util.Set;

import psa.springframework.psapetclinic.model.Owner;
import psa.springframework.psapetclinic.services.CrudServices;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudServices<Owner, Long> {

    
	@Override
    public Set<Owner> findall() {
        return super.findall();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
    	return super.save(object.getId(),object);

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
