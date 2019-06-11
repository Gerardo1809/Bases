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
public class Avion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String idavion;

	
	@Column
	private Float tipoavion;
	
	@Column
	private Long modelo;
	
	@Column
	private String marca;
	
	@Column
	private Date capacidadasiento;
	
	



	
	
	
	
}
