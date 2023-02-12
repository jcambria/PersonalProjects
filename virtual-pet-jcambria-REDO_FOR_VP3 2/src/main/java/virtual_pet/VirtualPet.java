package virtual_pet;

public abstract class VirtualPet implements Walks {
    final private String name;
    private int hunger;
    private int thirst;
    private int boredom;
    private int cleanliness;

    private int oil;
    private int batteryPower;


    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
        this.boredom = 50;
        this.cleanliness = 50;
        this.oil = 50;
        this.batteryPower = 50;
    }


    public String getName() {

        return name;
    }


    public int getThirst() {

        return thirst;
    }

    public int getOilLevel() {
        return oil;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {

        return boredom;
    }

    public int getCleanliness() {
        return cleanliness;
    }


    public void giveH20() {
        this.thirst += 4;
        this.cleanliness -= 1;


    }

    public void feedPet() {
        this.hunger += 5;
        this.cleanliness -= 2;
        this.thirst -= 2;

    }


    public void playWithPet() {
        this.hunger -= 4;
        this.thirst -= 3;
        this.boredom -= 6;
        this.cleanliness -= 3;

    }

    public void tick() {
        this.thirst--;
        this.hunger -= 2;
        this.batteryPower--;
        this.oil -= 2;
        this.boredom--;
        this.cleanliness--;

    }

    public void walk() {
        this.boredom -= 10;
        this.cleanliness += 5;
        this.thirst -= 4;
        this.hunger -= 1;
    }

    public void roboWalk() {
        this.oil -= 8;
        this.batteryPower -= 5;
        this.boredom -= 2;

    }

    public void oilRoboticPets() {
        this.oil += 8;

    }

    public void cleanCage() {
        this.cleanliness += 20;

    }

    public void cleanLitterBox() {
        this.cleanliness += 20;
    }

    public void chargeRoboticPets() {
        this.batteryPower += 8;
        this.boredom -= 2;
    }


}






