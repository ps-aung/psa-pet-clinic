/**
 * 
 */
package psa.springframework.psapetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.Vet;
import psa.springframework.psapetclinic.services.VetService;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	@Override
    public Set<Vet> findall() {
        return super.findall();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
    	return super.save(object);

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
