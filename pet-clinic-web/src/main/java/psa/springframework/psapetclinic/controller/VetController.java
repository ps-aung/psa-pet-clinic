/**
 * 
 */
package psa.springframework.psapetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
@Controller
public class VetController {
	
	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String listVets() {
		return "vets/index";
	}

}
