/**
 * 
 */
package psa.springframework.psapetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import psa.springframework.psapetclinic.model.Owner;
import psa.springframework.psapetclinic.model.Vet;
import psa.springframework.psapetclinic.services.OwnerService;
import psa.springframework.psapetclinic.services.VetService;
import psa.springframework.psapetclinic.services.map.OwnerMapService;
import psa.springframework.psapetclinic.services.map.VetMapService;

/**
 * Created by pyaesoneaung on 21/04/2020
 *
 */
@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	
	
	
	/**
	 * @param ownerService
	 */
	public DataLoader() {
		super();
		ownerService = new OwnerMapService();
		vetService = new VetMapService();
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Pyae Sone");
		owner1.setLastName("Aung");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Thet Hnin");
		owner2.setLastName("Swe");
		
		ownerService.save(owner2);
		
		System.out.println("loaded owners........");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Vet1");
		vet1.setLastName("Doctor");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Vet2");
		vet2.setLastName("Doctor");
		
		vetService.save(vet2);
		
		System.out.println("loaded vets........");
		
		
	}

}
