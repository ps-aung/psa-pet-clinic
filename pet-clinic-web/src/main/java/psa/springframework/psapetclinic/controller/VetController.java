/**
 * 
 */
package psa.springframework.psapetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import psa.springframework.psapetclinic.model.Vet;
import psa.springframework.psapetclinic.services.VetService;

import java.util.Set;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */

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



	@RequestMapping({"/vets","/vets/","/vets/index","/vets/index.html","/vets.html"})
	public String listVets(Model model) {
		
		model.addAttribute("vets", vetService.findAll());
		
		return "vets/index";
	}

	@RequestMapping("/api/vets")
	public @ResponseBody Set<Vet> getVetsJson(){
		return vetService.findAll();
	}

}
