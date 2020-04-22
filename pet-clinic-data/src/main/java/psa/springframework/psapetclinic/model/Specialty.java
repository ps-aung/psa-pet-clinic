/**
 * 
 */
package psa.springframework.psapetclinic.model;

/**
 * Created by pyaesoneaung on 22/04/2020
 *
 */
public class Specialty extends BaseEntity  {
	
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
