package com.openpay.process.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import com.openpay.process.Repository.BitacoraRepository;
import com.openpay.process.model.BitacoraDto;

@Service
@EnableAsync
public class BitacoraServiceImpl implements BitacoraService{
	

	private static final Logger LOG = LoggerFactory.getLogger(BitacoraServiceImpl.class);
			
	@Autowired
	private BitacoraRepository bitacoraRepository;

	@Override
	public void addBitacora(BitacoraDto bitacora) {
		
		LOG.info("Save Bitacora");
		bitacoraRepository.save(bitacora);
	}

	@Override
	public List<BitacoraDto> getAllBitacoras() {
	
		LOG.info("Consume service ALL Bitacoras");
		addBitacora(new BitacoraDto("getAllBitacoras", new Date()));
		return bitacoraRepository.findAll();
	}

}
