/**
 * 
 */
package psa.springframework.psapetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
import psa.springframework.psapetclinic.services.OwnerService;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	public final OwnerService ownerService;
	
	
	
	/**
	 * @param ownService
	 */
	public OwnerController(OwnerService ownService) {
		super();
		this.ownerService = ownService;
	}



	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model) {
	
		model.addAttribute("owners", ownerService.findall());
		
		return "owners/index";
	}
	
	@RequestMapping({"/find"})
	public String findOwners() {
		return "notimplemented";
	}

	@GetMapping("/{ownerId}")
	public ModelAndView showOwner(@PathVariable Long ownerId) {
		ModelAndView mav = new ModelAndView("owners/ownerDetails");
		mav.addObject(ownerService.findById(ownerId));
		return mav;
	}

}
