package com.javialej.xnbiblioteca.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Representa un Prestamo de un Texto por una Persona en la Biblioteca
 * @author Javier Alejandro Pérez, FRoM
 * @version 1.0.0-1-2017 
 */
@Entity
@Table(name="prestamo")
public class Prestamo implements Serializable{
	
	/*
	 * Atributos de la clase Prestamo.
	 */
	@Id
	@Column(name="id_prestamo", updatable = false, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id_prestamo;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity= Libro.class)
	@JoinColumn(name="id_texto")
	protected Texto texto;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity= Usuario.class)
	@JoinColumn(name="id_persona")
	protected Persona persona;
	
	/*
	 * Constructor vacio de Prestamo.
	 */
	public Prestamo() {
		this.texto = null;
		this.persona = null;
	}
	
	/*
	 * Otro constructor de objetos tipo Prestamo. 
	 */
	public Prestamo(Texto texto, Persona persona) {
		this.texto = texto;
		this.persona = persona;
	}
	
	/*
	 * Texto del Prestamo.
	 */
	public void setTexto(Texto texto) {
		this.texto = texto;
	}
	
	/*
	 * @return texto la identificación del Texto.
	 */
	public Texto getTexto() {
		return texto;
	}
	
	/*
	 * Persona del Prestamo.
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	/*
	 * @return persona la identificación de la Persona.
	 */
	public Persona getPersona() {
		return persona;
	}
}
