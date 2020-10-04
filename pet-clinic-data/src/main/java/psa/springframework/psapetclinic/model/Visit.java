/**
 * 
 */
package psa.springframework.psapetclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by pyaesoneaung on 22/04/2020
 *
 */
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {
	
	@Column(name = "date")
	private LocalDate localDate;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne()
	@JoinColumn(name = "pet_id")
	private Pet pet;
	/**
	 * @return the localDate
	 */
	public LocalDate getLocalDate() {
		return localDate;
	}
	/**
	 * @param localDate the localDate to set
	 */
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the pet
	 */
	public Pet getPet() {
		return pet;
	}
	/**
	 * @param pet the pet to set
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	

}
