package virtual_pet;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;


public class VirtualPetShelter {

    public Map<String, RoboticPet> robo = new HashMap<>();

    public Map<String, RobotCat> roboCat = new HashMap<>();

    public Map<String, Dog> dog = new HashMap<>();

    public Map<String, Cat> cat = new HashMap<>();


    public void addInDog(Dog pet) {
        dog.put(pet.getName(), pet);
        pet.tick();

    }

    public void addInAnyO(Cat pet) {
        cat.put(pet.getName(), pet);
        pet.tick();

    }


    public void addInRobo(RoboticPet pet) {
        robo.put(pet.getName(), pet);
        pet.tick();
    }

    public void addInRoboCat(RobotCat pet) {
        roboCat.put(pet.getName(), pet);
        pet.tick();
    }

    public void displayDogs() {
        System.out.println("     *DOGS*     ");
        for (Entry<String, Dog> entry : dog.entrySet()) {
            System.out.println("|Name: " + entry.getValue().getName() + "  " + "" + "|Hunger: " + entry.getValue().getHunger()
                    + "|Thirst: " + entry.getValue().getThirst() + "|Boredom: " + entry.getValue().getBoredom() + "|Cleanliness: " +
                    entry.getValue().getCleanliness());
        }

    }

    public void displayCats() {
        System.out.println("     *CATS*     ");
        for (Entry<String, Cat> entry1 : cat.entrySet()) {
            System.out.println("|Name:  " + entry1.getValue().getName() + "|Hunger: " + entry1.getValue().getHunger()
                    + "|Thirst: " + entry1.getValue().getThirst() + "|Boredom: " + entry1.getValue().getBoredom() + "|Cleanliness: " +
                    entry1.getValue().getCleanliness());
        }


    }

    public void displayRoboDogs() {
        System.out.println("  *ROBO DOGS*");
        for (Entry<String, RoboticPet> roboticPet : robo.entrySet()) {
            System.out.println("|Name: " + roboticPet.getValue().getName() + " |Oil level: " + roboticPet.getValue().getOilLevel()
                    + "|Battery Level: " + roboticPet.getValue().getBatteryPower() + "|Boredom: " + roboticPet.getValue().getBoredom());
        }

    }

    public void displayRoboCats() {
        System.out.println("  *ROBO CATS*");
        for (Entry<String, RobotCat> catEntry : roboCat.entrySet()) {
            System.out.println("|Name: " + catEntry.getValue().getName() + " |Oil level: " + catEntry.getValue().getOilLevel()
                    + "|Battery Level: " + catEntry.getValue().getBatteryPower() + "|Boredom: " + catEntry.getValue().getBoredom());
        }

    }


    public void displayOPets() {
        System.out.println("[---ORGANIC PETS---]");
        System.out.println("  *  * \uD83D\uDC08 \uD83D\uDC15 *  *");
        System.out.println("     --DOGS--     ");
        for (Entry<String, Dog> entry : dog.entrySet()) {
            entry.getValue().tick();
            System.out.println("|Name: " + entry.getValue().getName() + "  " + "" + "|Hunger: " + entry.getValue().getHunger()
                    + "|Thirst: " + entry.getValue().getThirst() + "|Boredom: " + entry.getValue().getBoredom() + "|Cleanliness: " +
                    entry.getValue().getCleanliness());
        }
        System.out.println("     --CATS--     ");
        for (Entry<String, Cat> entry1 : cat.entrySet()) {
            entry1.getValue().tick();
            System.out.println("|Name:  " + entry1.getValue().getName() + "|Hunger: " + entry1.getValue().getHunger()
                    + "|Thirst: " + entry1.getValue().getThirst() + "|Boredom: " + entry1.getValue().getBoredom() + "|Cleanliness: " +
                    entry1.getValue().getCleanliness());
        }


    }


    public void displayRobos() {
        System.out.println("[---ROBOTIC PETS---]");
        System.out.println("    *  *\uD83E\uDD16*  *");
        System.out.println("  --ROBO DOGS--");
        for (Entry<String, RoboticPet> roboticPet : robo.entrySet()) {
            roboticPet.getValue().tick();
            System.out.println("|Name: " + roboticPet.getValue().getName() + " |Oil level: " + roboticPet.getValue().getOilLevel()
                    + "|Battery Level: " + roboticPet.getValue().getBatteryPower() + "|Boredom: " + roboticPet.getValue().getBoredom());
        }
        System.out.println("  --ROBO CATS--");
        for (Entry<String, RobotCat> catEntry : roboCat.entrySet()) {
            catEntry.getValue().tick();
            System.out.println("|Name: " + catEntry.getValue().getName() + " |Oil level: " + catEntry.getValue().getOilLevel()
                    + "|Battery Level: " + catEntry.getValue().getBatteryPower() + "|Boredom: " + catEntry.getValue().getBoredom());

        }


    }


    public boolean hasOPets() {
        return !dog.isEmpty();
    }

    public boolean hasRPets() {
        return !robo.isEmpty();
    }

    public void adoptOutD(String name) {
        dog.remove(name);

    }

    public void adoptOutC(String name) {
        cat.remove(name);
    }


    public void adoptRobo(String name) {
        robo.remove(name);

    }

    public void adoptRc(String name) {
        roboCat.remove(name);
    }

    public void walkAllOrganic() {
        for (Entry<String, Dog> pet : dog.entrySet()) {
            pet.getValue().walk();
        }
        for (Entry<String, Cat> catEntry : cat.entrySet()) {
            catEntry.getValue().walk();
        }


    }

    public void feedOrganic() {
        for (Entry<String, Dog> pet : dog.entrySet()) {
            pet.getValue().feedPet();
        }
        for (Entry<String, Cat> catEntry : cat.entrySet()) {
            catEntry.getValue().feedPet();
        }
    }

    public void walkRoboPets() {
        for (Entry<String, RoboticPet> pet : robo.entrySet()) {
            pet.getValue().roboWalk();
        }
        for (Entry<String, RobotCat> catEntry : roboCat.entrySet()) {
            catEntry.getValue().roboWalk();
        }
    }


    public void drinkAllOrganic() {
        for (Entry<String, Dog> pet : dog.entrySet()) {
            pet.getValue().giveH20();
        }
        for (Entry<String, Cat> catEntry : cat.entrySet()) {
            catEntry.getValue().giveH20();
        }
    }


    public void oilAllRobos() {
        for (Entry<String, RoboticPet> pet : robo.entrySet()) {
            pet.getValue().oilRoboticPets();

        }
        for (Entry<String, RobotCat> pet : roboCat.entrySet()) {
            pet.getValue().oilRoboticPets();
        }

    }


    public void ChargeAllRobos() {
        for (Entry<String, RoboticPet> pet : robo.entrySet()) {
            pet.getValue().chargeRoboticPets();
        }
        for (Entry<String, RobotCat> pet : roboCat.entrySet()) {
            pet.getValue().chargeRoboticPets();
        }
    }


    public void cleanOrPets() {
        for (Entry<String, Cat> cat : cat.entrySet()) {
            cat.getValue().cleanLitterBox();
        }
        for (Entry<String, Dog> dog : dog.entrySet()) {
            dog.getValue().cleanCage();
        }
    }

    public void playTimeO() {
        System.out.println("This is fun!");
        for (Organic pet : dog.values()) {
            pet.playWithPet();
        }
        for (Entry<String, Cat> catEntry : cat.entrySet()) {
            catEntry.getValue().playWithPet();
        }

    }
}





