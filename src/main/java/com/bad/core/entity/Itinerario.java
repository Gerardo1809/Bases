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
public class Itinerario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigoitinerario;

	
	@Column
	private String nombre;
	


	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigovuelo", referencedColumnName = "codigovuelo")
	private Vuelo vuelo;

	
	
	


}
