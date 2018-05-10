package com.Camilo.mundial.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "jugador")
public class Jugador implements Serializable {
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "id")
	private Equipo equipo;
	@Column(name = "numrero")
	private int numero;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "email")
	private String email;
	@Column(name = "posicion")
	private String posicion;
	@Column(name = "fechanacimiento")
	private Date fechanacimineto;

	public Jugador(Equipo equipo, int numero, String nombre, String email, String posicion, Date fechanacimineto) {
		super();
		this.equipo = equipo;
		this.numero = numero;
		this.nombre = nombre;
		this.email = email;
		this.posicion = posicion;
		this.fechanacimineto = fechanacimineto;
	}

	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
