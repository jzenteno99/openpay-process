package com.openpay.process.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.openpay.process.model.BitacoraDto;

public interface BitacoraService {
	
	public void addBitacora(BitacoraDto bitacora);
	
	public List<BitacoraDto> getAllBitacoras();

}
