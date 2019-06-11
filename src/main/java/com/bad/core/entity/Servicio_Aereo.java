package com.bad.core.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;

@Entity
public class Servicio_Aereo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	
	@Column
	private String nombreoficial;
	
	@Column
	private String abreviatura;
	
	@Column
	private String paisorigen;
	
	@Column
	private String representante;
	
	@Column
	private String facebook;
	
	@Column
	private String twitter;
	
	@Column
	private String correoelectronico;
	
	@Column
	@Type(type="date")
	private Date fundacion;

	public Servicio_Aereo(Long codigo, String nombreoficial, String abreviatura, String paisorigen,
			String representante, String facebook, String twitter, String correoelectronico, Date fundacion) {
		super();
		this.codigo = codigo;
		this.nombreoficial = nombreoficial;
		this.abreviatura = abreviatura;
		this.paisorigen = paisorigen;
		this.representante = representante;
		this.facebook = facebook;
		this.twitter = twitter;
		this.correoelectronico = correoelectronico;
		this.fundacion = fundacion;
	}

	public Servicio_Aereo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombreoficial() {
		return nombreoficial;
	}

	public void setNombreoficial(String nombreoficial) {
		this.nombreoficial = nombreoficial;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getPaisorigen() {
		return paisorigen;
	}

	public void setPaisorigen(String paisorigen) {
		this.paisorigen = paisorigen;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public Date getFundacion() {
		return fundacion;
	}

	public void setFundacion(Date fundacion) {
		this.fundacion = fundacion;
	}

	



	
	
	
}
