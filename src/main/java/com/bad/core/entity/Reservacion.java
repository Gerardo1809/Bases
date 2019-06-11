package com.bad.core.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Reservacion {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idreservacion;

	
	@Column
	private String codigoreservacion;
	
	@Column
	private Date fechasalida;
	
	@Column
	private Date fecharegreso;
	
	@Column
	private Long numeromaletas;
	
	@Column
	private Long numeroasientos;


	@Column
	private Float preciototal;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigoitinerario", referencedColumnName = "codigoitinerario")
	private Itinerario itinerario;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Cliente cliente;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="reservacion",cascade = CascadeType.ALL)
    private Set<ViajeroFrecuente> viajero;

	public Reservacion(Long idreservacion, String codigoreservacion, Date fechasalida, Date fecharegreso,
			Long numeromaletas, Long numeroasientos, Float preciototal, Itinerario itinerario, Cliente cliente,
			Set<ViajeroFrecuente> viajero) {
		super();
		this.idreservacion = idreservacion;
		this.codigoreservacion = codigoreservacion;
		this.fechasalida = fechasalida;
		this.fecharegreso = fecharegreso;
		this.numeromaletas = numeromaletas;
		this.numeroasientos = numeroasientos;
		this.preciototal = preciototal;
		this.itinerario = itinerario;
		this.cliente = cliente;
		this.viajero = viajero;
	}

	public Reservacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdreservacion() {
		return idreservacion;
	}

	public void setIdreservacion(Long idreservacion) {
		this.idreservacion = idreservacion;
	}

	public String getCodigoreservacion() {
		return codigoreservacion;
	}

	public void setCodigoreservacion(String codigoreservacion) {
		this.codigoreservacion = codigoreservacion;
	}

	public Date getFechasalida() {
		return fechasalida;
	}

	public void setFechasalida(Date fechasalida) {
		this.fechasalida = fechasalida;
	}

	public Date getFecharegreso() {
		return fecharegreso;
	}

	public void setFecharegreso(Date fecharegreso) {
		this.fecharegreso = fecharegreso;
	}

	public Long getNumeromaletas() {
		return numeromaletas;
	}

	public void setNumeromaletas(Long numeromaletas) {
		this.numeromaletas = numeromaletas;
	}

	public Long getNumeroasientos() {
		return numeroasientos;
	}

	public void setNumeroasientos(Long numeroasientos) {
		this.numeroasientos = numeroasientos;
	}

	public Float getPreciototal() {
		return preciototal;
	}

	public void setPreciototal(Float preciototal) {
		this.preciototal = preciototal;
	}

	public Itinerario getItinerario() {
		return itinerario;
	}

	public void setItinerario(Itinerario itinerario) {
		this.itinerario = itinerario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<ViajeroFrecuente> getViajero() {
		return viajero;
	}

	public void setViajero(Set<ViajeroFrecuente> viajero) {
		this.viajero = viajero;
	}


	

	
	
	
	

}
