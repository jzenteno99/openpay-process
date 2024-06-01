package com.openpay.process.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openpay.process.model.BitacoraDto;
import com.openpay.process.model.CharacterDto;
import com.openpay.process.model.iCharacter;
import com.openpay.process.service.BitacoraService;
import com.openpay.process.service.CharacterService;


@RestController
@RequestMapping("marvel/services")
public class ConsultasController {
	
	private static final Logger LOG = LoggerFactory.getLogger(ConsultasController.class);
	
	@Autowired
	private CharacterService characterService;
	
	@Autowired
	private BitacoraService bitacoraService;
	
	
	@GetMapping("/getAllCharacters")
	public ResponseEntity <List<CharacterDto>> getAllCharacters() {
		
		LOG.info("Consume service get ALL characters");
		List<CharacterDto> lista = characterService.getAllCharacters();
		
		return ResponseEntity.ok(lista);
	}

	
	@SuppressWarnings("deprecation")
	@GetMapping("/getCharacterById/{id}")
	public ResponseEntity <CharacterDto> getCharacterById(@PathVariable int id) {
		
		LOG.info("Consume service get ONE character");
		CharacterDto res = characterService.getCharacterByID(id);
		
		return ResponseEntity.ok(res);
	}
	
	@GetMapping("/getAllBitacoras")
	public ResponseEntity <List<BitacoraDto>> getAllBitacoras() {
		
		LOG.info("Consume service ALL Bitacoras");
		List<BitacoraDto> lista = bitacoraService.getAllBitacoras();
		
		return ResponseEntity.ok(lista);
	}
}
