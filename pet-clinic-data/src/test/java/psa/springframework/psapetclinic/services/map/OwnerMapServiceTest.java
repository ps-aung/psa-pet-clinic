package psa.springframework.psapetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import psa.springframework.psapetclinic.model.Owner;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    final Long ownerId = 1L;
    final String lastName = "Aung";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetMapService(),new PetTypeMapService());
        ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findall() {
        Set<Owner> owners =  ownerMapService.findall();
        assertEquals(1,owners.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId,owner.getId());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Owner owner2 = Owner.builder().id(id).build();
        Owner owner = ownerMapService.save(owner2);
        assertEquals(id,owner.getId());
    }

    @Test
    void saveNoId(){
        Owner savedOwner = ownerMapService.save(Owner.builder().build());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0,ownerMapService.findall().size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);
        assertEquals(0,ownerMapService.findall().size());
    }

    @Test
    void findByLastName() {
        Owner aung = ownerMapService.findByLastName(lastName);
        assertNotNull(aung);
        assertEquals(lastName,aung.getLastName());
    }

    @Test
    void findByLastNameNotFound() {
        Owner swe = ownerMapService.findByLastName("swe");
        assertNull(swe);
    }
}