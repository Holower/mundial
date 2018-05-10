package com.Camilo.mundial.model;

import java.io.Serializable;

import javax.persistence.Column;



public class JugadorPK implements Serializable {
	@Column (name="equipo",insertable=false, updatable=false)
	private int id;
	private int numero;

	
	public JugadorPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
