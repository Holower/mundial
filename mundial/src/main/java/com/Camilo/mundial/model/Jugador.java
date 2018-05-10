package com.Camilo.mundial.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "jugador")
public class Jugador implements Serializable {
	@EmbeddedId
	@Column(name = "id")
	private JugadorPK id;
	@ManyToOne
	@JoinColumn (name="equipo",insertable=false, updatable=false)
	private Equipo equipo;
	private String nombre;
	@Column(name = "email")
	private String email;
	@Column(name = "posicion")
	private String posicion;
	@Column(name = "fechanacimiento")
	private Date fechanacimineto;


	public Jugador() {
		
	}

	public Date getFechanacimineto() {
		return fechanacimineto;
	}

	public void setFechanacimineto(Date fechanacimineto) {
		this.fechanacimineto = fechanacimineto;
	}

	
	
	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public JugadorPK getId() {
		return id;
	}

	public void setId(JugadorPK id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}
