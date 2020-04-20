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
@RequestMapping("/vets")
@Controller
public class VetController {
	
	@RequestMapping({"","/","/index","/index.html"})
	public String listVets() {
		return "vets/index";
	}

}
