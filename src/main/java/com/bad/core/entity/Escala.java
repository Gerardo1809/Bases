package com.bad.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ESCALA")
public class Escala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idescala;

	
	@Column
	private String pais;
	
	@Column
	private Date horallegada;
	
	@Column
	private Date horasalida;
	
	@Column
	private Long gateway;

	public Escala(Long idescala, String pais, Date horallegada, Date horasalida, Long gateway) {
		super();
		this.idescala = idescala;
		this.pais = pais;
		this.horallegada = horallegada;
		this.horasalida = horasalida;
		this.gateway = gateway;
	}

	public Escala() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdescala() {
		return idescala;
	}

	public void setIdescala(Long idescala) {
		this.idescala = idescala;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getHorallegada() {
		return horallegada;
	}

	public void setHorallegada(Date horallegada) {
		this.horallegada = horallegada;
	}

	public Date getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(Date horasalida) {
		this.horasalida = horasalida;
	}

	public Long getGateway() {
		return gateway;
	}

	public void setGateway(Long gateway) {
		this.gateway = gateway;
	}
	
	

	
	
	

}
