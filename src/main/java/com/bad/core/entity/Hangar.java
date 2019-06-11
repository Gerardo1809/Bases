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
public class Hangar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigohangar;

	
	@Column
	private Long estado;
	
	@Column
	private Date tiempo;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigohangar", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Aeropuerto aeropuerto;


	public Hangar(Long codigohangar, Long estado, Date tiempo, Aeropuerto aeropuerto) {
		super();
		this.codigohangar = codigohangar;
		this.estado = estado;
		this.tiempo = tiempo;
		this.aeropuerto = aeropuerto;
	}


	public Hangar() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getCodigohangar() {
		return codigohangar;
	}


	public void setCodigohangar(Long codigohangar) {
		this.codigohangar = codigohangar;
	}


	public Long getEstado() {
		return estado;
	}


	public void setEstado(Long estado) {
		this.estado = estado;
	}


	public Date getTiempo() {
		return tiempo;
	}


	public void setTiempo(Date tiempo) {
		this.tiempo = tiempo;
	}


	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}


	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}
	
	
}
