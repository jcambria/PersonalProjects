package com.wcci.virtualPetAPI;

import com.wcci.virtualPetAPI.entities.virtual_pet.GenericPet;
import com.wcci.virtualPetAPI.entities.virtual_pet.RoboticCat;
import com.wcci.virtualPetAPI.entities.virtual_pet.RoboticDog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class VirtualPetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualPetApiApplication.class, args);
	}

}
