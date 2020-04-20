/**
 * 
 */
package psa.springframework.psapetclinic.model;

import java.io.Serializable;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
public class BaseEntity implements Serializable {
	
	private Long id;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
