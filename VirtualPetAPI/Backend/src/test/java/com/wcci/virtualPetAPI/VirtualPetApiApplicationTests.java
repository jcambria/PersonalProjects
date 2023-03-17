package com.wcci.virtualPetAPI;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wcci.virtualPetAPI.entities.virtual_pet.GenericPet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureMockMvc
class VirtualPetApiApplicationTests {
	@Autowired
	private MockMvc mvc;
	@Test
	public void getPets() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/pets").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("[]")))
				.andDo(MockMvcResultHandlers.print());
	}

	@Test
	public void addPetAndFind() throws Exception {
		final GenericPet genericPet = new GenericPet("jeff");
		//create a pet
		mvc.perform(MockMvcRequestBuilders.post("/pets")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(getJsonContent(genericPet)))
				.andExpect(status().isOk())
				.andDo(MockMvcResultHandlers.print());

		//get pet by Id
		mvc.perform(MockMvcRequestBuilders.get("pets/jeff").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.content().json(getJsonContent(genericPet)))
				.andDo(MockMvcResultHandlers.print());
	}

	@Test
	public void addPetToShelter() throws Exception {

	}



	private static String getJsonContent(Object o) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(o);
	}


}
