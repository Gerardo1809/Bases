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
public class Aeropuerto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigoaeropuerto;

	
	@Column
	private String nombre;
	
	@Column
	private String telefono;
	
	@Column
	private String responsable;
	
	@Column
	private Long totalestaciones;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idciudad", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Ciudad ciudad;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="aeropuerto",cascade = CascadeType.ALL)
    private Set<Hangar> hangar;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="aeropuerto",cascade = CascadeType.ALL)
    private Set<Vuelo> vuelo;

	public Aeropuerto(Long codigoaeropuerto, String nombre, String telefono, String responsable, Long totalestaciones,
			Ciudad ciudad, Set<Hangar> hangar, Set<Vuelo> vuelo) {
		super();
		this.codigoaeropuerto = codigoaeropuerto;
		this.nombre = nombre;
		this.telefono = telefono;
		this.responsable = responsable;
		this.totalestaciones = totalestaciones;
		this.ciudad = ciudad;
		this.hangar = hangar;
		this.vuelo = vuelo;
	}

	public Aeropuerto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCodigoaeropuerto() {
		return codigoaeropuerto;
	}

	public void setCodigoaeropuerto(Long codigoaeropuerto) {
		this.codigoaeropuerto = codigoaeropuerto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Long getTotalestaciones() {
		return totalestaciones;
	}

	public void setTotalestaciones(Long totalestaciones) {
		this.totalestaciones = totalestaciones;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Set<Hangar> getHangar() {
		return hangar;
	}

	public void setHangar(Set<Hangar> hangar) {
		this.hangar = hangar;
	}

	public Set<Vuelo> getVuelo() {
		return vuelo;
	}

	public void setVuelo(Set<Vuelo> vuelo) {
		this.vuelo = vuelo;
	}

	


	
	
}
