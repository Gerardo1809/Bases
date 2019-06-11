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
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codigovuelo;

	
	@Column
	private Float costodeviaje;
	
	@Column
	private Long millarecorrida;
	
	@Column
	private String millaotorgada;
	
	@Column
	private Date tiempodevuelo;
	
	@Column
	private String origen;
	
	@Column
	private String destino;
	
	@Column
	private Long asientosdisponibles;
	
	@Column
	private Boolean escala;
	
	
	

	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigoitinerario", referencedColumnName = "codigoitinerario")
	private Itinerario itinerario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Servicio_Aereo servicio;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idescala", referencedColumnName = "idescala")
	private Escala escalacon;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="vuelo",cascade = CascadeType.ALL)
    private Set<Asientos> asiento;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idavion", referencedColumnName = "idavion")
	private Avion avion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoaeropuerto", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Aeropuerto aeropuerto;

	

	
	
	
}
