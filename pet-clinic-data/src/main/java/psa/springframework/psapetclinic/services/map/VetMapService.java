/**
 * 
 */
package psa.springframework.psapetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.Speciality;
import psa.springframework.psapetclinic.model.Vet;
import psa.springframework.psapetclinic.services.VetService;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
@Service
@Profile({"default","map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialtyMapService specialMapService;
	
	
	
	/**
	 * @param specialMapService
	 */
	public VetMapService(SpecialtyMapService specialMapService) {
		super();
		this.specialMapService = specialMapService;
	}

	@Override
    public Set<Vet> findAll() {
        return super.findall();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
    	if(object.getSpecialties().size() > 0) {
    		object.getSpecialties().forEach(specialty->{
    			if(specialty.getId() == null) {
    				Speciality savedSpecialty = specialMapService.save(specialty);
    				specialty.setId(savedSpecialty.getId());
    			}
    		});
    	}
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
