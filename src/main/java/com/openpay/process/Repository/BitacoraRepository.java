package com.openpay.process.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openpay.process.model.BitacoraDto;

@Repository
public interface BitacoraRepository extends JpaRepository<BitacoraDto, Integer>{

}
