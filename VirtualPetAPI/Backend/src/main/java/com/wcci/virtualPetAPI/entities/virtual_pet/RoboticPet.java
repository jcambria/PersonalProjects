package com.wcci.virtualPetAPI.entities.virtual_pet;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
abstract public class RoboticPet extends GenericPet {


    protected int oil = 75;
    protected int maintenance = 75;
    protected int cleanliness = 75;


public RoboticPet(){}
    public RoboticPet(final String name) {
        super(name);
    }

    public void care() {
        System.out.println("You provide oil and maintenance for " + name + ".");
        this.oil += 10;
        this.maintenance += 10;
        this.cleanliness += 10;
    }

    public void walk() {
    }


    public void clean() {
        System.out.println("You clean the grease off of " + name + ".");
        this.cleanliness += 10;
    }

    public void play() {
        this.oil--;
        this.maintenance--;
        this.cleanliness--;
    }

    public void tick() {
        this.oil--;
        this.maintenance--;
        this.cleanliness--;
    }

    public void status() {
        System.out.println(this.getName() + " Oil " + this.getOil() + " Maintenance: " + this.getMaintenance() + " Cleanliness: " + this.getCleanliness());
    }

    public String getName() {
        return name;
    }

    public int getOil() {
        return oil;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public int getCleanliness() {
        return cleanliness;
    }
}
