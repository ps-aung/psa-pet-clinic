/**
 * 
 */
package psa.springframework.psapetclinic.model;

/**
 * Created by pyaesoneaung on 22/04/2020
 *
 */
public class Specialty extends BaseEntity  {
	
	private String descriptionString;

	/**
	 * @return the descriptionString
	 */
	public String getDescriptionString() {
		return descriptionString;
	}

	/**
	 * @param descriptionString the descriptionString to set
	 */
	public void setDescriptionString(String descriptionString) {
		this.descriptionString = descriptionString;
	}
	

}
