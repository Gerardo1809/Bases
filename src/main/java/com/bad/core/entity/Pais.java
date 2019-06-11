package com.bad.core.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idpais;

	@Column
	private String codigopais;
	
	@Column
	private String nombrepais;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="pais",cascade = CascadeType.ALL)
    private Set<Ciudad> ciudad;

	public Pais(Long idpais, String codigopais, String nombrepais, Set<Ciudad> ciudad) {
		super();
		this.idpais = idpais;
		this.codigopais = codigopais;
		this.nombrepais = nombrepais;
		this.ciudad = ciudad;
	}

	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdpais() {
		return idpais;
	}

	public void setIdpais(Long idpais) {
		this.idpais = idpais;
	}

	public String getCodigopais() {
		return codigopais;
	}

	public void setCodigopais(String codigopais) {
		this.codigopais = codigopais;
	}

	public String getNombrepais() {
		return nombrepais;
	}

	public void setNombrepais(String nombrepais) {
		this.nombrepais = nombrepais;
	}

	public Set<Ciudad> getCiudad() {
		return ciudad;
	}

	public void setCiudad(Set<Ciudad> ciudad) {
		this.ciudad = ciudad;
	}

	
	
	
	
}
