package virtual_pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

final class VirtualPetApp {
    public static void main(String[] args) {

        VirtualPetShelter petShelter = new VirtualPetShelter();

        petShelter.addInRobo(new RoboticDog("Elon", 50, 50, 50));
        petShelter.addInRoboCat(new RobotCat("Jimothy", 50, 50, 50));
        petShelter.addInDog(new Dog("Tiny", 50, 50, 50, 50));
        petShelter.addInDog(new Dog("Sushi", 50, 50, 50, 50));


        Scanner input = new Scanner(System.in);

        System.out.println(" \uD83D\uDE0EWELCOME TO THE PET SHELTER (ROBOTS INCLUDED)\uD83D\uDE0E" + "\n");

        String options = "\nWhat would you like to do next?  \n" + "\n" + "(1) Feed the pets \uD83C\uDF72 \n"
                + "(2) Give the pets a drink \uD83E\uDD64 \n" + "(3) Play with pet \uD83D\uDC36 \n" + "(4) Oil all robots \uD83D\uDEE2 \n"
                + "(5) Charge battery in robots \uD83D\uDD0B \n" + "(6) Adopt a pet ➾ \n" + "(7) Clean dog cages & litter boxes \uD83D\uDEBF \n" + "(8) Walk organic pets \uD83D\uDEB6 \n"
                + "(9) Do the robo-walk \uD83E\uDDBF\n" + "(10) Add a pet into shelter ✅\n" + "(11) Leave shelter";


        String userSelect;
        boolean running = true;
        //userSelect = input.nextLine();
        while (running) {
            do {
                petShelter.displayOPets();
                petShelter.displayRobos();

                System.out.println(options);
                userSelect = input.next();
                switch (userSelect) {
                    case "1": //feed pets
                        System.out.println("All organic pets have been fed. *Remember robots don't need food*");
                        petShelter.feedOrganic();
                        break;
                    case "2": //water pets
                        petShelter.drinkAllOrganic();
                        System.out.println("All the pets took a drink, ahh nothing like fresh water. *Remember robots don't get thirsty*");
                        break;
                    case "3": // play with a pet
                        System.out.println("You played with all the organic pets.");
                        petShelter.playTimeO();
                        break;
                    case "4": // oil all robots
                        petShelter.oilAllRobos();
                        System.out.println("Wow their dance moves look a lot smoother now!");
                        break;
                    case "5": // charge battery in robots
                        petShelter.ChargeAllRobos();
                        System.out.println("All powered up!");
                        break;
                    case "6": //adopt a pet
                        System.out.println("You want to adopt a pet!");
                        System.out.println("Do you want: \nA. Dog \nB. Cat\nC. Robot Dog\nD. Robot Cat");
                        input.nextLine();
                        String adoptPet = input.nextLine();
                        if (adoptPet.equalsIgnoreCase("a")) {
                            System.out.println("Here are all our dogs in the shelter");
                            petShelter.displayDogs();
                            System.out.println("Enter the name of the dog you would like to adopt:");
                            String adoptDog = input.nextLine();
                            if (petShelter.hasOPets()) {
                                petShelter.adoptOutD(adoptDog);
                            }
                        } else if (adoptPet.equalsIgnoreCase("b")) {
                            System.out.println("Here are all our cats in the shelter");
                            petShelter.displayCats();
                            System.out.println("Enter the name of the cat you would like to adopt:");
                            String adoptCat = input.nextLine();
                            if (petShelter.hasOPets()) {
                                petShelter.adoptOutC(adoptCat);
                            }
                        } else if (adoptPet.equalsIgnoreCase("c")) {
                            System.out.println("Here are all our robo-dogs in the shelter");
                            petShelter.displayRoboDogs();
                            System.out.println("Enter the name of the robo-dog you want to adopt:");
                            String adoptRoboDog = input.nextLine();
                            if (petShelter.hasRPets()) {
                                petShelter.adoptRobo(adoptRoboDog);
                            }
                        } else if (adoptPet.equalsIgnoreCase("d")) {
                            System.out.println("Here are all our robo-cats in the shelter");
                            petShelter.displayRoboCats();
                            System.out.println("Enter the name of the robo-cat you want to adopt:");
                            String adoptRoboCog = input.nextLine();
                            if (petShelter.hasRPets()) {
                                petShelter.adoptRc(adoptRoboCog);
                            } else {
                                System.out.println("Im sorry, please try again.");
                            }


                        }
                        break;


                    case "7": //Clean cages and litter-boxes
                        petShelter.cleanOrPets();
                        System.out.println("Squeaky clean!");

                    case "8": // walk organic pets
                        System.out.println("*Cats enjoy walks just as much as dogs*");
                        petShelter.walkAllOrganic();
                        break;

                    case "9":
                        System.out.println("Robot voice: That is fun");
                        petShelter.walkRoboPets();
                        break;
                    case "10": //adding pet to shelter
                        System.out.println("Do you have: \nA. Dog \nB. Cat\nC. Robot Dog\nD. Robot Cat");
                        String petType = input.next();
                        if (petType.equalsIgnoreCase("a")) {
                            System.out.println("What is the name of the dog?");
                            input.nextLine();
                            String response1 = input.nextLine();

                            Dog dog = new Dog(response1, 50, 50, 50, 50);
                            petShelter.addInDog(dog);

                            break;
                        } else if (petType.equalsIgnoreCase("b")) {
                            System.out.println("What is the name of your cat?");
                            input.nextLine();
                            String response2 = input.nextLine();
                            System.out.println();

                            Cat pet = new Cat(response2, 50, 50, 50, 50);
                            petShelter.addInAnyO(pet);
                            break;
                        } else if (petType.equalsIgnoreCase("c")) {
                            System.out.println("What is the  name of your robo Dog?");
                            input.nextLine();
                            String response3 = input.nextLine();
                            RoboticDog robo = new RoboticDog(response3, 50, 50, 50);
                            petShelter.addInRobo(robo);
                            break;
                        } else if (petType.equalsIgnoreCase("d")) {
                            System.out.println("What is the name of your robo cat?");
                            input.nextLine();
                            String response4 = input.nextLine();
                            RobotCat robotCat = new RobotCat(response4, 50, 50, 50);
                            petShelter.addInRoboCat(robotCat);

                        }
                    case "11":
                        running = false;

                }


            } while (petShelter.hasOPets() && petShelter.hasRPets());
        }
    }
}







