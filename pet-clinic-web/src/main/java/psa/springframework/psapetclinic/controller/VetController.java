/**
 * 
 */
package psa.springframework.psapetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import psa.springframework.psapetclinic.services.VetService;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
@RequestMapping("/vets")
@Controller
public class VetController {
	
	public final VetService vetService;
	
	/**
	 * @param vetService
	 */
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}



	@RequestMapping({"","/","/index","/index.html"})
	public String listVets(Model model) {
		
		model.addAttribute("vets", vetService.findall());
		
		return "vets/index";
	}

}
