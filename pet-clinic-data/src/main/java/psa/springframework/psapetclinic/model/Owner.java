/**
 * 
 */
package psa.springframework.psapetclinic.model;

import java.util.Set;

/**
 * Created by pyaesoneaung on 14/04/2020
 *
 */
public class Owner extends Person {
	
	private Set<Pet> pets;

	/**
	 * @return the pets
	 */
	public Set<Pet> getPets() {
		return pets;
	}

	/**
	 * @param pets the pets to set
	 */
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	

}
