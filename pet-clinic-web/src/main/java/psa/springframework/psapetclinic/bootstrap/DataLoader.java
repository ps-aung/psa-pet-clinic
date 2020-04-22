/**
 * 
 */
package psa.springframework.psapetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import psa.springframework.psapetclinic.model.Owner;
import psa.springframework.psapetclinic.model.Pet;
import psa.springframework.psapetclinic.model.PetType;
import psa.springframework.psapetclinic.model.Vet;
import psa.springframework.psapetclinic.services.OwnerService;
import psa.springframework.psapetclinic.services.PetTypeService;
import psa.springframework.psapetclinic.services.VetService;

/**
 * Created by pyaesoneaung on 21/04/2020
 *
 */
@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	


	/**
	 * @param ownerService
	 * @param vetService
	 */
	public DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Pyae Sone");
		owner1.setLastName("Aung");
		owner1.setAddress("South Okkalapa");
		owner1.setCity("Yangon");
		owner1.setTelephone("09xxxxx");
		
		Pet psapet = new Pet();
		psapet.setPetType(savedDogPetType);
		psapet.setOwner(owner1);
		psapet.setBirthDate(LocalDate.now());
		psapet.setName("aung net");
		owner1.getPets().add(psapet);
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Thet Hnin");
		owner2.setLastName("Swe");
		owner2.setAddress("Mayangone");
		owner2.setCity("Yangon");
		owner2.setTelephone("09xxxxxx");
		
		Pet thspet = new Pet();
		thspet.setPetType(savedCatPetType);
		thspet.setOwner(owner2);
		thspet.setBirthDate(LocalDate.now());
		thspet.setName("mee mee");
		owner2.getPets().add(thspet);
		
		ownerService.save(owner2);
		
		System.out.println("loaded owners........");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Vet1");
		vet1.setLastName("Doctor");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Vet2");
		vet2.setLastName("Doctor");
		
		vetService.save(vet2);
		
		System.out.println("loaded vets........");
		
		
	}

}
