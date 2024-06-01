package com.openpay.process.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table (name= "Bitacora")
public class BitacoraDto {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameService;
	private Date fechaOpera;
	
	public BitacoraDto () {
		
	}

	public BitacoraDto (String nameService, Date fechaOpera) {
	
		this.nameService = nameService;
		this.fechaOpera = fechaOpera;
	}
	
	@Override
	public String toString() {
		return "BitacoraDto [id=" + id + ", nameService=" + nameService + ", fechaOpera=" + fechaOpera + "]";
	}

	public Long getId() {
		return id;
	}
	public String getNameService() {
		return nameService;
	}
	public Date getFechaOpera() {
		return fechaOpera;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNameService(String nameService) {
		this.nameService = nameService;
	}
	public void setFechaOpera(Date fechaOpera) {
		this.fechaOpera = fechaOpera;
	}
}
