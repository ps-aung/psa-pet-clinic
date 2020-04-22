/**
 * 
 */
package psa.springframework.psapetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import psa.springframework.psapetclinic.services.OwnerService;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	public final OwnerService ownService;
	
	
	
	/**
	 * @param ownService
	 */
	public OwnerController(OwnerService ownService) {
		super();
		this.ownService = ownService;
	}



	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model) {
	
		model.addAttribute("owners", ownService.findall());
		
		return "owners/index";
	}
	
	@RequestMapping({"/find"})
	public String findOwners() {
		return "notimplemented";
	}

}
