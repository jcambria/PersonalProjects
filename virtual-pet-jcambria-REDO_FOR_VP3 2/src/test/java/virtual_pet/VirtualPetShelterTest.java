package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class VirtualPetShelterTest {

    @Test
    public void testOil() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        RoboticPet roboDog = new RoboticPet("robo", 10, 10, 10);
        underTest.addInRobo(roboDog);
        underTest.oilAllRobos();
        int result = roboDog.getOilLevel();
        assertEquals(56, result);
    }

    @Test
    public void doesShelterHavePets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        boolean result = underTest.hasOPets();
        assertFalse(result);
    }

    @Test
    public void doesShelterHaveRoboPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        boolean result = underTest.hasRPets();
        assertFalse(result);
    }

    @Test
    public void shelterCanCleanCages() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        Dog aPet = new Dog("Bud", 10, 10, 10, 10);
        underTest.addInDog(aPet);
        aPet.cleanCage();
        int result = 20;
        assertEquals(20, result);
    }

    @Test
    public void shelterCanWalkAllDogs() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        Dog aDog = new Dog("Bud", 10, 10, 10, 10);
        underTest.addInDog(aDog);
        underTest.walkAllOrganic();
        int result = aDog.getCleanliness();
        assertEquals(54, result);
    }


}








