package com.wcci.virtualPetAPI.entities.virtual_pet;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
//@JsonTypeName("cat")
@Entity
public class Cat extends OrganicPet {

    public String type = "Cat";
    public Cat(){}
    public Cat(String name) {
        super(name);
    }

    public void clean() {
        System.out.println("You cleaned " + this.name + "'s litter box.");
        cleanliness += 10;
    }

    @Override
    public void walk() {
        this.fun--;
    }
}

