package com.wcci.virtualPetAPI.entities.virtual_pet;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//@JsonTypeName("robocat")
@Entity
public class RoboticCat extends RoboticPet {
    public String type = "Robo Cat";

    public RoboticCat(){}
    public RoboticCat(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(name + " follows you out, but then turns around");
        this.cleanliness -= 1;
        this.maintenance -= 1;
    }
}