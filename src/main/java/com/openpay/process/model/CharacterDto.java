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
@Table (name= "Characters")
public class CharacterDto{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String valor;
	private Date fecha;
	
	
	@Override
	public String toString() {
		return "CharacterDto [id=" + id + ", valor=" + valor + ", fecha=" + fecha + "]";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


}
