package com.wcci.virtualPetAPI.repositories;

import com.wcci.virtualPetAPI.entities.virtual_pet.VirtualPetShelter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetShelterRepository extends CrudRepository<VirtualPetShelter, Long> {
}
