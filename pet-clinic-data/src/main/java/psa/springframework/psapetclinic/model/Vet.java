/**
 * 
 */
package psa.springframework.psapetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Created by pyaesoneaung on 14/04/2020
 *
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"),
	inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	
	private Set<Speciality> specialties = new HashSet<Speciality>();

	/**
	 * @return the specialties
	 */
	public Set<Speciality> getSpecialties() {
		return specialties;
	}

	/**
	 * @param specialties the specialties to set
	 */
	public void setSpecialties(Set<Speciality> specialties) {
		this.specialties = specialties;
	}
	
	

}
