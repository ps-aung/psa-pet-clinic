/**
 * 
 */
package psa.springframework.psapetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pyaesoneaung on 22/04/2020
 *
 */
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity  {
	
	@Column(name = "description")
	private String description;

	/**
	 * @return the descriptionString
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param descriptionString the descriptionString to set
	 */
	public void setDescription(String descriptionString) {
		this.description = descriptionString;
	}
	

}
