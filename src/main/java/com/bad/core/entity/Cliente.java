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
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_cliente;

	
	
	@Column
	private String estadocivil;
	
	@Column
	private String telefonomovil;
	
	@Column
	private String telefonofijo;
	
	@Column
	private String nombreempresa;


	@Column
	private String direccion;
	
	@Column
	private String documento;
	
	
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="cliente",cascade = CascadeType.ALL)
    private Set<Reservacion> reservacion;



	public Cliente(Long id_cliente, String estadocivil, String telefonomovil, String telefonofijo, String nombreempresa,
			String direccion, String documento, Set<Reservacion> reservacion) {
		super();
		this.id_cliente = id_cliente;
		this.estadocivil = estadocivil;
		this.telefonomovil = telefonomovil;
		this.telefonofijo = telefonofijo;
		this.nombreempresa = nombreempresa;
		this.direccion = direccion;
		this.documento = documento;
		this.reservacion = reservacion;
	}



	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}



	public String getEstadocivil() {
		return estadocivil;
	}



	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}



	public String getTelefonomovil() {
		return telefonomovil;
	}



	public void setTelefonomovil(String telefonomovil) {
		this.telefonomovil = telefonomovil;
	}



	public String getTelefonofijo() {
		return telefonofijo;
	}



	public void setTelefonofijo(String telefonofijo) {
		this.telefonofijo = telefonofijo;
	}



	public String getNombreempresa() {
		return nombreempresa;
	}



	public void setNombreempresa(String nombreempresa) {
		this.nombreempresa = nombreempresa;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getDocumento() {
		return documento;
	}



	public void setDocumento(String documento) {
		this.documento = documento;
	}



	public Set<Reservacion> getReservacion() {
		return reservacion;
	}



	public void setReservacion(Set<Reservacion> reservacion) {
		this.reservacion = reservacion;
	}

	

	
	

	  

	
	
}
