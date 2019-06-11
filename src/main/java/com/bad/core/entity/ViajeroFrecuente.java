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
public class ViajeroFrecuente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idviajerofrecuente;

	
	@Column
	private Long idcliente;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idreservacion", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Reservacion reservacion;



	public ViajeroFrecuente(Long idviajerofrecuente, Long idcliente, Reservacion reservacion) {
		super();
		this.idviajerofrecuente = idviajerofrecuente;
		this.idcliente = idcliente;
		this.reservacion = reservacion;
	}



	public ViajeroFrecuente() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getIdviajerofrecuente() {
		return idviajerofrecuente;
	}



	public void setIdviajerofrecuente(Long idviajerofrecuente) {
		this.idviajerofrecuente = idviajerofrecuente;
	}



	public Long getIdcliente() {
		return idcliente;
	}



	public void setIdcliente(Long idcliente) {
		this.idcliente = idcliente;
	}



	public Reservacion getReservacion() {
		return reservacion;
	}



	public void setReservacion(Reservacion reservacion) {
		this.reservacion = reservacion;
	}
	
	
	
}
