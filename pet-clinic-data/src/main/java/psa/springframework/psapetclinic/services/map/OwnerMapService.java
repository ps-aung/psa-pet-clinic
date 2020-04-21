/**
 * 
 */
package psa.springframework.psapetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.Owner;
import psa.springframework.psapetclinic.services.OwnerService;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    
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
    	return super.save(object);

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

	@Override
	public Owner findByLastName(String lastname) {
		// TODO Auto-generated method stub
		return null;
	}

}
