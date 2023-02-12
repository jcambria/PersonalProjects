//package virtual_pet;
//
//import java.lang.invoke.VarHandle;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//
//public class VirtualPetApplication {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        // User interacts to customize pet
//        System.out.println("What is the name of your pet?");
//        String name = input.nextLine();
//        System.out.println("What is the color of your pet?");
//        String color = input.nextLine();
//        System.out.println("What type of pet do you want?");
//        String type = input.nextLine();
//        System.out.println("Hi " + name + " the" + " " + color + " " + type + "! " + "Lets have some fun...");
//
//        VirtualPet pet = new VirtualPet(name, color, type);
//
//        // After user customizes pet, define pet, & health scale for user knowledge of pets well-being
//        int select = 1;
//
//        System.out.println("Please take care of " + pet.getName() + "! All of our pets are very special to us...");
//        // could also use boolean instead of int select
//        while (select != 0) {
//            System.out.println("This example works with all the scales: Hunger Scale 0 means REALLY HUNGRY, & 10 means well fed");
//            System.out.println("Boredom: " + pet.getBored() + " Tired: " + pet.getSleepy() + " Hunger: " + pet.getHunger() + " Thirst: " + pet.getThirst());
//            System.out.println("Pick a number. ");
//            System.out.println("[0] Quit");
//            System.out.println("[1] Play with " + pet.getName());
//            System.out.println("[2] Feed " + pet.getName());
//            System.out.println("[3] Give water ");
//            System.out.println("[4] Take a nap with " + pet.getName());
//
//            select = input.nextInt();
//            // have scale change based off what user wants to do with pet
//            // remind user to try not to go below 3 in any of the scales
//            System.out.println("Do not go below 3 in any of the scales or we will have to take " + pet.getName() + " back to the shelter.");
//
//            if (select == 1) { // play with pet
//                System.out.println(pet.getAfterPlay());
//            } else if (select == 2) { // feed the pet
//                System.out.println(pet.getAfterEat());
//            } else if (select == 3) { // give water to pet
//                System.out.println(pet.getAfterDrink());
//            } else if (select == 4) { // take a nap with pet
//                System.out.println(pet.getAfterNap());
//            }
//            // quit game because user isn't taking care of pet properly
//            if (pet.getHunger() < 2 || pet.getThirst() < 2 || pet.getSleepy() < 2 || pet.getBored() < 2) {
//                System.out.println("Im sorry.." + pet.getName() + " would be better taken care of back at the shelter...");
//
//            }
//            if (pet.getHunger() >= 10 || pet.getThirst() >= 10 || pet.getSleepy() >= 10 || pet.getBored() >= 10) {
//                System.out.println("Wow " + pet.getName() + " really loves you. We'd be honnored if you would choose another pet to take care of... ");
//                System.out.println("Please press 5 to adpot another pet! We have some for you to choose from ");
//                String newName = input.nextLine();
//
//
//
//            }
//
//            //    pet.tick(); // tick will drop tired scale by 1 making the pet more tired after any activity user decides to
//
//        }
//    }
//}
//
//
//
//
//
//
////Interact with a VirtualPet object in this method