package com.openpay.process.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openpay.process.model.CharacterDto;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterDto, Integer>{

}
