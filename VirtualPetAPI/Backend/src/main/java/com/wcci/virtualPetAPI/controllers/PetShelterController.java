package com.wcci.virtualPetAPI.controllers;

import com.wcci.virtualPetAPI.entities.virtual_pet.GenericPet;
import com.wcci.virtualPetAPI.entities.virtual_pet.VirtualPetShelter;
import com.wcci.virtualPetAPI.repositories.PetShelterRepository;
import com.wcci.virtualPetAPI.repositories.VirtualPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PetShelterController {
    private PetShelterRepository petShelterRepository;
    private VirtualPetRepository virtualPetRepository;

    // curl -X POST http://localhost:8080/petshelter -H 'Content-Type: application/json' -d '{"shelterName": "java the shelter"}'
    // curl -X POST http://localhost:8080/petshelter -H 'Content-Type: application/json' -d '{"shelterName": "the second shelter"}'
    //* curl -X POST http://localhost:8080/petshelter/1/pet_name/jeff -H 'Content-Type: application/json'

    public PetShelterController(@Autowired PetShelterRepository petShelterRepository,
                                @Autowired VirtualPetRepository virtualPetRepository){
        this.petShelterRepository = petShelterRepository;
        this.virtualPetRepository = virtualPetRepository;
    }

    @GetMapping("/petshelter")
    public Iterable<VirtualPetShelter> getAllShelters() {
        System.out.println(petShelterRepository.findAll());
        return petShelterRepository.findAll();
    }
    @GetMapping("/petshelter/{shelter_id}")
    public Optional<VirtualPetShelter> getShelterById(@PathVariable Long shelter_id) {
        return petShelterRepository.findById(shelter_id);
    }
    @PostMapping("/petshelter")
    public VirtualPetShelter addNewShelter(@RequestBody VirtualPetShelter virtualPetShelter){
        return petShelterRepository.save(virtualPetShelter);
    }
    @PostMapping("/petshelter/{shelter_id}/pet_name/{pet_name}")
    public Iterable<VirtualPetShelter> addPetToShelter(@PathVariable Long shelter_id,
                                                       @PathVariable String pet_name){
        GenericPet existingPet = virtualPetRepository
                .findById(pet_name)
                .get();

        Optional<VirtualPetShelter> existingShelter = petShelterRepository.findById(shelter_id);

         existingShelter.map((VirtualPetShelter petShelter) -> {
            petShelter.admitPet(existingPet);
            System.out.println("Adding pet to shelter");
            return petShelterRepository.save(petShelter);
        });

        return petShelterRepository.findAll();

    }




}
