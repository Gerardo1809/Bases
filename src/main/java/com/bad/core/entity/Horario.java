package com.bad.core.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Horario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idhorario;

	
	@Column
	private Date horallegada;
	
	@Column
	private Date horasalida;
	
	@Column
	private Date fecha;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigovuelo", referencedColumnName = "codigovuelo")
	private Vuelo vuelo;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idgateway", referencedColumnName = "idgateway")
	private Gateway gateway;

	public Horario(Long idhorario, Date horallegada, Date horasalida, Date fecha, Vuelo vuelo, Gateway gateway) {
		super();
		this.idhorario = idhorario;
		this.horallegada = horallegada;
		this.horasalida = horasalida;
		this.fecha = fecha;
		this.vuelo = vuelo;
		this.gateway = gateway;
	}

	public Horario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdhorario() {
		return idhorario;
	}

	public void setIdhorario(Long idhorario) {
		this.idhorario = idhorario;
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Gateway getGateway() {
		return gateway;
	}

	public void setGateway(Gateway gateway) {
		this.gateway = gateway;
	}
	
	
}
