package com.wcci.virtualPetAPI.controllers;

import com.wcci.virtualPetAPI.entities.virtual_pet.*;
import com.wcci.virtualPetAPI.repositories.VirtualPetRepository;
import com.wcci.virtualPetAPI.repositories.PetShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin // when javascript is working, this is not needed.
public class PetController {
    private PetShelterRepository petShelterRepository;
    private VirtualPetRepository virtualPetRepository;

    // curl -X POST http://localhost:8080/pets -H 'Content-Type: application/json' -d '{"name": "jeff, but dont do this"}'
    // curl -X POST http://localhost:8080/robodog -H 'Content-Type: application/json' -d '{"name": "robojeff"}'
    // curl -X POST http://localhost:8080/robocat -H 'Content-Type: application/json' -d '{"name": "robodoug"}'
    // curl -X POST http://localhost:8080/dog -H 'Content-Type: application/json' -d '{"name": "jeff"}'
    // curl -X POST http://localhost:8080/cat -H 'Content-Type: application/json' -d '{"name": "doug"}'
    // curl -X PUT http://localhost:8080/tick -H 'Content-Type: application/json'
    // curl -X PUT http://localhost:8080/care -H 'Content-Type: application/json'
    // curl -X PUT http://localhost:8080/walk -H 'Content-Type: application/json'
    // curl -X PUT http://localhost:8080/clean -H 'Content-Type: application/json'
    // curl -X PUT http://localhost:8080/play/jeff -H 'Content-Type: application/json'

    /*
    <button id="walkPet"
   onclick="fetch('http://localhost:8080/walk', { headers: { 'Content-Type': 'application/json'},
           'method':'POST'})">
           walk pet!
    </button>
    */
    public PetController(@Autowired PetShelterRepository petShelterRepository,
                         @Autowired VirtualPetRepository genericPetRepository) {
        this.petShelterRepository = petShelterRepository;
        this.virtualPetRepository = genericPetRepository;
    }

    @GetMapping("/pets")
    public Iterable<GenericPet> getAllPets() {
        return virtualPetRepository.findAll();
    }

    @GetMapping("/pets/{pet_name}")
    public GenericPet getPetByName(@PathVariable String pet_name) {
        return virtualPetRepository.findById(pet_name).get();
    }

    @DeleteMapping("/pets/{pet_name}")
    public void deletePet(@PathVariable String pet_name) {
        Optional<GenericPet> existingPet = virtualPetRepository.findById(pet_name);
        if (existingPet.isPresent()) {
            virtualPetRepository.deleteById(pet_name);
        }
    }

    @PostMapping("/pets")
    public GenericPet postPet(@RequestBody GenericPet pet) {
        return virtualPetRepository.save(pet);
    }

    @PostMapping("/robodog")
    public GenericPet postRoboDogPet(@RequestBody RoboticDog pet) {
        return virtualPetRepository.save(pet);
    }

    @PostMapping("/robocat")
    public GenericPet postRoboCatPet(@RequestBody RoboticCat pet) {
        return virtualPetRepository.save(pet);
    }

    @PostMapping("/dog")
    public GenericPet postDogPet(@RequestBody Dog pet) {
        return virtualPetRepository.save(pet);
    }

    @PostMapping("/cat")
    public GenericPet postCatPet(@RequestBody Cat pet) {
        return virtualPetRepository.save(pet);
    }

    /*
    @PostMapping("/robodog/{shelter_id}")
    public GenericPet postRoboDogPetToShelter(@PathVariable Long shelter_id, @RequestBody RoboticDog pet) {
        pet.setPetShelter(petShelterRepository.findById(shelter_id).get());
        return virtualPetRepository.save(pet);
    }
    */


    @PutMapping("/tick")
    public Iterable<GenericPet> petTick() {
       virtualPetRepository.findAll().forEach(pet -> {
            pet.tick();
            virtualPetRepository.save(pet);
        });
       return virtualPetRepository.findAll();
    }
    @PutMapping("/tick/{pet_name}")
    public GenericPet singlePetTick(@PathVariable String pet_name) {
        GenericPet existingPet = virtualPetRepository.findById(pet_name).get();
        existingPet.tick();
        return virtualPetRepository.save(existingPet);
    }

    @PutMapping("/care")
    public Iterable<GenericPet> petCare() {
        virtualPetRepository.findAll().forEach(pet -> {
            pet.care();
            virtualPetRepository.save(pet);
        });
        return virtualPetRepository.findAll();
    }
    @PutMapping("/care/{pet_name}")
    public GenericPet singlePetCare(@PathVariable String pet_name) {
        GenericPet existingPet = virtualPetRepository.findById(pet_name).get();
        existingPet.care();
        return virtualPetRepository.save(existingPet);
    }
    @PutMapping("/walk")
    public Iterable<GenericPet> petWalk() {
        virtualPetRepository.findAll().forEach(pet -> {
            pet.walk();
            virtualPetRepository.save(pet);
        });
        return virtualPetRepository.findAll();
    }
    @PutMapping("/walk/{pet_name}")
    public GenericPet singlePetWalk(@PathVariable String pet_name) {
        GenericPet existingPet = virtualPetRepository.findById(pet_name).get();
        existingPet.walk();
        return virtualPetRepository.save(existingPet);
    }

    @PutMapping("/play")
    public Iterable<GenericPet> petPlay() {
        virtualPetRepository.findAll().forEach(pet -> {
            pet.play();
            virtualPetRepository.save(pet);
        });
        return virtualPetRepository.findAll();
    }
    @PutMapping("/play/{pet_name}")
    public GenericPet singlePetPlay(@PathVariable String pet_name) {
        GenericPet existingPet = virtualPetRepository.findById(pet_name).get();
        existingPet.play();
        return virtualPetRepository.save(existingPet);
    }

    @PutMapping("/clean")
    public Iterable<GenericPet> petClean() {
        virtualPetRepository.findAll().forEach(pet -> {
            pet.clean();
            virtualPetRepository.save(pet);
        });
        return virtualPetRepository.findAll();
    }
    @PutMapping("/clean/{pet_name}")
    public GenericPet singlePetClean(@PathVariable String pet_name) {
        GenericPet existingPet = virtualPetRepository.findById(pet_name).get();
        existingPet.clean();
        return virtualPetRepository.save(existingPet);
    }


}
