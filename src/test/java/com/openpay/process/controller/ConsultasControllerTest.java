package com.openpay.process.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.openpay.process.model.CharacterDto;
import com.openpay.process.service.CharacterService;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ConsultasController.class)
public class ConsultasControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private CharacterService characterService;
	
	private CharacterDto characterDto;
	
	@BeforeEach
	void setup() {
		
		characterDto = new CharacterDto();
		characterDto.setId(1L);
		characterDto.setValor("A");
		characterDto.setFecha(new Date());
	}

	@Test
	private void getAllCharacters() throws Exception{
		
		when(characterService.getCharacterByID(1)).thenReturn(characterDto);
		
		mockMvc.perform(get("marvel/services/getAllCharacters"))
				.andExpect(status().isOk())
				.andExpect(view().name("valor"))
				.andExpect(model().attribute("characters", null));
				
	}

	
}
