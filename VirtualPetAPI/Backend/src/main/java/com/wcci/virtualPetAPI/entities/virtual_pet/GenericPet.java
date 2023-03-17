package com.wcci.virtualPetAPI.entities.virtual_pet;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
/*
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = RoboticDog.class, name = "robodog"),
        @JsonSubTypes.Type(value = RoboticCat.class, name = "robocat"),
        @JsonSubTypes.Type(value = Cat.class, name = "cat"),
        @JsonSubTypes.Type(value = Dog.class, name = "dog")
})
*/
public class GenericPet implements VirtualPet{

    @Id
    String name;

    public void setPetShelter(VirtualPetShelter petShelter) {
        this.petShelter = petShelter;
    }

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    @JsonIgnore
    private VirtualPetShelter petShelter;

    public GenericPet(){}

    public GenericPet(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void tick() {

    }

    @Override
    public void play() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void status() {

    }

    @Override
    public void care() {

    }

    @Override
    public void clean() {

    }
}
