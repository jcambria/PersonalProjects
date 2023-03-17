package com.wcci.virtualPetAPI.entities.virtual_pet;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;

//@JsonTypeName("dog")
@Entity
public class Dog extends OrganicPet {

    public String type = "Dog";
    public Dog(){}
    public Dog(String name) {
        super(name);
    }

    public void clean() {
        System.out.println("You cleaned " + this.name + "'s cage.");
        cleanliness += 10;
    }

    @Override
    public void walk() {
        this.fun += 10;
        this.thirsty -= 2;
        this.thirsty -= 2;
    }

}

