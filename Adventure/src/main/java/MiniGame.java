import java.util.HashMap;
import java.util.Scanner;

    public class MiniGame {

        public static void main(String[] args) {
            HashMap<String, Integer> inventory = new HashMap<>();
            inventory.put("gold", 0);
            inventory.put("sword", 0);
            inventory.put("potion", 0);
            inventory.put("cloak", 0);
            inventory.put("shield", 0);

            Scanner scanner = new Scanner(System.in);
            boolean gameOver = false;

            System.out.println("Welcome to the mini game!");

            while (!gameOver) {
                System.out.println("\nWhat do you want to do?");
                System.out.println("1. Explore");
                System.out.println("2. Check inventory");
                System.out.println("3. Quit");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        int goldFound = (int) (Math.random() * 10) + 1;
                        System.out.println("You found " + goldFound + " gold!");
                        inventory.put("gold", inventory.get("gold") + goldFound);
                        int itemFound = (int) (Math.random() * 3) + 1;
                        switch (itemFound) {
                            case 1:
                                System.out.println("You found a sword!");
                                inventory.put("sword", inventory.get("sword") + 1);
                                break;
                            case 2:
                                System.out.println("You found a potion!");
                                inventory.put("potion", inventory.get("potion") + 1);
                                break;
                            case 3:
                                System.out.println("You found a cloak!");
                                inventory.put("cloak", inventory.get("cloak") + 1);
                                break;
                            case 4:
                                System.out.println("You found a shield");
                                inventory.put("shield", inventory.get("shield") + 1);
                            default:
                                System.out.println("You didn't find any items.");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("Inventory:");
                        System.out.println("Gold: " + inventory.get("gold"));
                        System.out.println("Sword: " + inventory.get("sword"));
                        System.out.println("Potion: " + inventory.get("potion"));
                        System.out.println("Cloak: " + inventory.get("cloak"));
                        System.out.println("shield: " + inventory.get("shield"));
                        break;

                    case 3:
                        System.out.println("Goodbye!");
                        gameOver = true;
                        break;

                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }

            scanner.close();
        }
    }
