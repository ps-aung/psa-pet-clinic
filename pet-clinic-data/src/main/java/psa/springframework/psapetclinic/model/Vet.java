/**
 * 
 */
package psa.springframework.psapetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pyaesoneaung on 14/04/2020
 *
 */
public class Vet extends Person {
	
	private Set<Specialty> specialties = new HashSet<Specialty>();

	/**
	 * @return the specialties
	 */
	public Set<Specialty> getSpecialties() {
		return specialties;
	}

	/**
	 * @param specialties the specialties to set
	 */
	public void setSpecialties(Set<Specialty> specialties) {
		this.specialties = specialties;
	}
	
	

}
