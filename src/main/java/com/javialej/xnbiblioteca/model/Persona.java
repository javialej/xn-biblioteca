package com.javialej.xnbiblioteca.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

/**
 * Representa una persona de la Biblioteca
 * @author Javier Alejandro Pérez, FRoM
 * @version 1.0.0-1-2017 
 * 
 * Esta es una clase abstracta, se puede reutilizar para añadir
 * nuevos roles de personas: Bibliotecario, Administrador, etc..., 
 * en el caso que se llegue a requerir.
 */

@MappedSuperclass
public abstract class Persona {
	
	/*
	 * Atributos de la clase Persona.
	 */
	@Id	
	@Column(name="id_persona", updatable = false, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id_persona;
	
	@Column(name="nombre", nullable = false)
	protected String nombre;
	
	@Column(name="email", nullable = false)
	protected String email;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_persona")
	protected Set<Prestamo> prestamos;
	
	/*
	 * Constructor vacio de Persona.
	 */
	public Persona() {
		this.id_persona = (long) -1;
		this.nombre = "";
		this.email = "";
	}
	
	/*
	 * Otro constructor de objetos tipo Persona. 
	 */
	public Persona(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}
	
	/*
	 * @return Id de la Persona.
	 */
	public Long getIdPersona() {
		return id_persona;
	}
	
	/*
	 * @return nombre de la Persona.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/*
	 * @return email de la Persona.
	 */
	public String getEmail() {
		return email;
	}
}
