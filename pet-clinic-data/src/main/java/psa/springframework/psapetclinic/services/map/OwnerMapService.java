/**
 * 
 */
package psa.springframework.psapetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.Owner;
import psa.springframework.psapetclinic.model.Pet;
import psa.springframework.psapetclinic.services.OwnerService;
import psa.springframework.psapetclinic.services.PetService;
import psa.springframework.psapetclinic.services.PetTypeService;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetService petservice;
	private final PetTypeService petTypeService;

	/**
	 * @param petservice
	 * @param petTypeMapService
	 */
	public OwnerMapService(PetService petservice, PetTypeService petTypeService) {
		super();
		this.petservice = petservice;
		this.petTypeService = petTypeService;
	}

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

		if(object != null){
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null){
                        Pet savedPet = petservice.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }

            return super.save(object);

        } else {
            return null;
        }
		

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
