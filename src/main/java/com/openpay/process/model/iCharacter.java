package com.openpay.process.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iCharacter extends JpaRepository<CharacterDto, Integer>{

}
