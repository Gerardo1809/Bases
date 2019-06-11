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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idciudad;

	@Column
	private String codigociudad;
	
	@Column
	private String nombreciudad;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpais", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Pais pais;

	@OneToMany(fetch = FetchType.EAGER,mappedBy="ciudad",cascade = CascadeType.ALL)
    private Set<Aeropuerto> aeropuerto;

	public Ciudad(Long idciudad, String codigociudad, String nombreciudad, Pais pais, Set<Aeropuerto> aeropuerto) {
		super();
		this.idciudad = idciudad;
		this.codigociudad = codigociudad;
		this.nombreciudad = nombreciudad;
		this.pais = pais;
		this.aeropuerto = aeropuerto;
	}

	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdciudad() {
		return idciudad;
	}

	public void setIdciudad(Long idciudad) {
		this.idciudad = idciudad;
	}

	public String getCodigociudad() {
		return codigociudad;
	}

	public void setCodigociudad(String codigociudad) {
		this.codigociudad = codigociudad;
	}

	public String getNombreciudad() {
		return nombreciudad;
	}

	public void setNombreciudad(String nombreciudad) {
		this.nombreciudad = nombreciudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Set<Aeropuerto> getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(Set<Aeropuerto> aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	
	
	
}
