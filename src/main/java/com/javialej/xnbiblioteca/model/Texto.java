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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Representa un texto de la Biblioteca
 * @author Javier Alejandro Pérez, FRoM
 * @version 1.0.0-1-2017
 * 
 * Esta es una clase abstracta, se puede reutilizar para añadir
 * nuevos textos como: Revistas, Periodicos, etc..., en el caso
 * en el caso que se llegue a requerir.
 */
@MappedSuperclass
public abstract class Texto {
	
	/*
	 * Atributos de la clase Texto.
	 */
	@Id
	@Column(name="id_texto", updatable = false, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id_texto;
	
	@Column(name="titulo", nullable = false)
	protected String titulo;
	
	@Column(name="autor", nullable = false)
	protected String autor;
	
	@Column(name="disponible", nullable = false, columnDefinition = "TINYINT", length = 1)
	protected boolean disponible;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_texto")
	@JsonIgnore
	protected Set<Prestamo> prestamos;
	
	/*
	 * Constructor vacio de Texto.
	 */
	public Texto() {
		this.titulo = "";
		this.autor = "";
		this.disponible = false;
	}
	
	/*
	 * Otro constructor de objetos tipo Texto. 
	 */
	public Texto(String titulo, String autor, boolean disponible) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponible = disponible;
	}
	
	/*
	 * @return titulo del Texto.
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/*
	 * @return autor del Texto.
	 */
	public String getAutor() {
		return autor;
	}
	
	/*
	 * @return disponibilidad del Texto.
	 */
	public boolean getDisponible() {
		return disponible;
	}
	
	/*
	 * Modifica la disponibilidad del Texto.
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
