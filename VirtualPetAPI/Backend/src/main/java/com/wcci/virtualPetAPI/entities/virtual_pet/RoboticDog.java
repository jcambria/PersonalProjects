package com.wcci.virtualPetAPI.entities.virtual_pet;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;

//@JsonTypeName("robodog")
@Entity
public class RoboticDog extends RoboticPet {
    public String type = "Robo Dog";
    public RoboticDog(){}
    public RoboticDog(String name) {
        super(name);

    }

    @Override
    public void walk() {
        this.cleanliness -= 2;
        this.maintenance -= 2;
    }
}
