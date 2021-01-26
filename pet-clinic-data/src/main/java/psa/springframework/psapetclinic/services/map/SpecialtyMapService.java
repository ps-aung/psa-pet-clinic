/**
 * 
 */
package psa.springframework.psapetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import psa.springframework.psapetclinic.model.Speciality;
import psa.springframework.psapetclinic.services.SpecialtiesService;

/**
 * Created by pyaesoneaung on 22/04/2020
 *
 */
@Service
@Profile({"default","map"})
public class SpecialtyMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

	@Override
	public Set<Speciality> findAll() {
		// TODO Auto-generated method stub
		return super.findall();
	}

	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(Speciality object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);

	}

}
