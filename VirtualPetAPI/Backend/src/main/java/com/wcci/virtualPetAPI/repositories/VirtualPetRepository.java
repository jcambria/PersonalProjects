package com.wcci.virtualPetAPI.repositories;

import com.wcci.virtualPetAPI.entities.virtual_pet.GenericPet;
import com.wcci.virtualPetAPI.entities.virtual_pet.VirtualPet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualPetRepository extends CrudRepository<GenericPet,String> {
}
