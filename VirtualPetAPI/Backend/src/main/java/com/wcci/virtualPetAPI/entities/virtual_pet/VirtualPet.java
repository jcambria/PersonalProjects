package com.wcci.virtualPetAPI.entities.virtual_pet;

import javax.persistence.ManyToOne;


public interface VirtualPet {


    void tick();

    void play();

    void walk();

    void status();

    void care();

    void clean();


}



