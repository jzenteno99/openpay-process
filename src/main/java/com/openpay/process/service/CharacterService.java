package com.openpay.process.service;

import java.util.List;

import com.openpay.process.model.CharacterDto;

public interface CharacterService {

	public List<CharacterDto> getAllCharacters();
	
	public CharacterDto getCharacterByID(Integer id);
}
