package com.wcci.virtualPetAPI.entities.virtual_pet;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

@Entity
public class VirtualPetShelter {

    @Id
    @GeneratedValue
    private Long id;
    private String shelterName;

    public VirtualPetShelter(){}

    public VirtualPetShelter(String shelterName){
        this.shelterName = shelterName;
    }


    @OneToMany(mappedBy = "petShelter")
    private Map<String, GenericPet> petShelter = new HashMap<>();


    public Long getId(){
        return id;
    }
    public String getShelterName() {
        return shelterName;
    }

    public Map<String, GenericPet> getPetShelter() {
        return petShelter;
    }

    public void admitPet(GenericPet pet){
        petShelter.put(pet.getName(), pet);
    }

    protected void adoptPet(String adopt) {
        this.petShelter.remove(adopt);
        for (Entry<String, GenericPet> adoptPet : petShelter.entrySet()) {
            adoptPet.getValue().tick();
        }
    }

    protected void careAllPets() {
        System.out.println("You took care of the pets!");
        for (Entry<String, GenericPet> feedAll : petShelter.entrySet()) {
            feedAll.getValue().care();
            feedAll.getValue().tick();
        }
    }


    protected void playAllPets() {
        System.out.println("You played with everyone!");
        for (Entry<String, GenericPet> playAll : petShelter.entrySet()) {
            playAll.getValue().play();
            playAll.getValue().tick();
        }
    }

    protected void printAllPets() {
        for (Entry<String, GenericPet> printAll : petShelter.entrySet()) {
            printAll.getValue().status();
        }
    }

    protected void singlePetPlay(String name) {
        System.out.println("You played with " + name);
        this.petShelter.get(name).play();
    }

    protected void walkAllPets() {
        System.out.println("You took everyone on a walk...except the cats.");
        for (Entry<String, GenericPet> walkAllPets : petShelter.entrySet()) {
            walkAllPets.getValue().walk();
            walkAllPets.getValue().tick();
        }
    }

    protected void cleanup() {
        for (Entry<String, GenericPet> clean : petShelter.entrySet()) {
            clean.getValue().clean();
        }
    }

    /*
    protected void admitDog(OrganicPet newDog) {
        this.petShelter.put(newDog.getName(), newDog);
        for (Entry<String, VirtualPet> admitDog : petShelter.entrySet()) {
            admitDog.getValue().tick();
        }
    }

    protected void admitCat(OrganicPet newCat) {
        this.petShelter.put(newCat.getName(), newCat);
        for (Entry<String, VirtualPet> admitCat : petShelter.entrySet()) {
            admitCat.getValue().tick();
        }
    }

    protected void admitRoboticDog(RoboticPet newRoboticDog) {
        this.petShelter.put(newRoboticDog.getName(), newRoboticDog);
        for (Entry<String, VirtualPet> admitRoboticDog : petShelter.entrySet()) {
            admitRoboticDog.getValue().tick();
        }
    }

    protected void admitRoboticCat(RoboticCat newRoboticCat) {
        this.petShelter.put(newRoboticCat.getName(), newRoboticCat);
        for (Entry<String, VirtualPet> admitRoboticCat : petShelter.entrySet()) {
            admitRoboticCat.getValue().tick();
        }
    }
*/
}