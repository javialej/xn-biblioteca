package com.javialej.xnbiblioteca.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Representa un libro de la Biblioteca
 * @author Javier Alejandro Pérez, FRoM
 * @version 1.0.0-1-2017
 */
@Entity
@Table(name="libro")
public class Libro extends Texto implements Serializable{
	
	/*
	 * Atributos de la clase Libro.
	 */
	
	
	/*
	 * Constructor vacio de Libro.
	 */
	public Libro() {
		super();
	}
	
	/*
	 * Otro constructor de objetos tipo Libro. 
	 */
	public Libro(String titulo, String autor, boolean disponible) {
		super(titulo, autor, disponible);
	}
	
	/*
	 * Muestra los detalles del Libro.
	 */
	public String toString() {
        String strLibro = titulo + " por: " + autor;
        if ( disponible == true)
        	strLibro += " - Disponible";
        else
        	strLibro += " - Prestado";
		
		return strLibro;
    }
}
