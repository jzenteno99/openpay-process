package com.openpay.process.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openpay.process.Repository.CharacterRepository;
import com.openpay.process.model.BitacoraDto;
import com.openpay.process.model.CharacterDto;

@Service
public class CharacterServiceImpl implements CharacterService{
	
	@Autowired
	CharacterRepository characterRepository;
	
	@Autowired
	BitacoraService bitacoraService;

	@Override
	public List<CharacterDto> getAllCharacters() {

		bitacoraService.addBitacora(new BitacoraDto("getAllCharacters", new Date()));
		List<CharacterDto> lista = characterRepository.findAll();
		
		return lista;
	}

	@Override
	public CharacterDto getCharacterByID(Integer id) {

		bitacoraService.addBitacora(new BitacoraDto("getCharacterById", new Date()));
		CharacterDto res = characterRepository.getById(id);
		
		return res;
	}

}
