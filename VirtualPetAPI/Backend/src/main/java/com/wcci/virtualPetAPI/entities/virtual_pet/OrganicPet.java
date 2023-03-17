package com.wcci.virtualPetAPI.entities.virtual_pet;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
abstract public class OrganicPet extends GenericPet {

    protected int hungry = 75;
    protected int thirsty = 75;
    protected int fun = 75;
    protected int cleanliness = 75;

public OrganicPet(){}
    public OrganicPet(final String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println("You give " + name + " food and water.");
        this.hungry += 10;
        this.thirsty += 10;
    }

    public void play() {
        fun += 10;
        thirsty -= 1;
        hungry -= 1;
    }

    public void tick() {
        this.hungry--;
        this.thirsty--;
        this.fun--;
        this.cleanliness--;
    }

    public void status() {
        System.out.println(this.getName() + " Hunger " + this.getHungry() + " Thirst " + this.getThirsty() + " Fun " + this.getFun() + " Cleanliness " + this.getCleanliness());
    }

    public String getName() {
        return name;
    }

    public int getHungry() {
        return hungry;
    }

    public int getThirsty() {
        return thirsty;
    }

    public int getFun() {
        return fun;
    }

    public int getCleanliness() {
        return cleanliness;
    }
}
