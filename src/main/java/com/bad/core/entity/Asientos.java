package com.bad.core.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
public class Asientos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String idasiento;

	
	@Column
	private Long letra;
	
	@Column
	private String estado;
	
	@Column
	private Date numero;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigovuelo", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Vuelo vuelo;



	public Asientos(String idasiento, Long letra, String estado, Date numero, Vuelo vuelo) {
		super();
		this.idasiento = idasiento;
		this.letra = letra;
		this.estado = estado;
		this.numero = numero;
		this.vuelo = vuelo;
	}



	public Asientos() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getIdasiento() {
		return idasiento;
	}



	public void setIdasiento(String idasiento) {
		this.idasiento = idasiento;
	}



	public Long getLetra() {
		return letra;
	}



	public void setLetra(Long letra) {
		this.letra = letra;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public Date getNumero() {
		return numero;
	}



	public void setNumero(Date numero) {
		this.numero = numero;
	}



	public Vuelo getVuelo() {
		return vuelo;
	}



	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
	
	
	
}
