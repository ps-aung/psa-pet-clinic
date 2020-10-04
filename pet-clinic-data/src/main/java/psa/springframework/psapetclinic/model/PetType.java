/**
 * 
 */
package psa.springframework.psapetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pyaesoneaung on 14/04/2020
 *
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
	
	@Column(name = "name")
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
