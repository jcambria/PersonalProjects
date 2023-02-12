package virtual_pet;

public class RoboticPet extends VirtualPet implements Walks {

    protected int oil;
    protected int batteryPower;

    public RoboticPet(String name, int oil, int batteryPower, int boredom) {
        super(name);
        this.oil = 50;
        this.batteryPower = 50;

    }

}
