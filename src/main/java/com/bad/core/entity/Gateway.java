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
public class Gateway {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idgateway;

	
	@Column
	private String codigogateway;
	
	



	
	
	
}
