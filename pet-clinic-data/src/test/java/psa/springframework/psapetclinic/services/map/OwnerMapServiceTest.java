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
    void setUp() throws Exception {
        ownerMapService = new OwnerMapService(new PetMapService(),new PetTypeMapService());
        ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findall() throws Exception {
        Set<Owner> owners =  ownerMapService.findAll();
        assertEquals(1,owners.size());
    }

    @Test
    void findById() throws Exception {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId,owner.getId());
    }

    @Test
    void saveExistingId() throws Exception {
        Long id = 2L;
        Owner owner2 = Owner.builder().id(id).build();
        Owner owner = ownerMapService.save(owner2);
        assertEquals(id,owner.getId());
    }

    @Test
    void saveNoId() throws Exception {
        Owner savedOwner = ownerMapService.save(Owner.builder().build());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void delete() throws Exception {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void deleteById() throws Exception {
        ownerMapService.deleteById(ownerId);
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() throws Exception {
        Owner aung = ownerMapService.findByLastName(lastName);
        assertNotNull(aung);
        assertEquals(lastName,aung.getLastName());
    }

    @Test
    void findByLastNameNotFound() throws Exception {
        Owner swe = ownerMapService.findByLastName("swe");
        assertNull(swe);
    }
}