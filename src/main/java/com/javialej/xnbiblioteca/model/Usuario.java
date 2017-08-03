package com.javialej.xnbiblioteca.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Representa un usuario de la Biblioteca
 * @author Javier Alejandro Pérez, FRoM
 * @version 1.0.0-1-2017
 */
@Entity
@Table(name="usuario")
public class Usuario extends Persona implements Serializable{
	
	/*
	 * Atributos de la clase Usuario.
	 */
	
	
	/*
	 * Constructor vacio de Usuario.
	 */
	public Usuario() {
		super();
	}
	
	/*
	 * Otro constructor de objetos tipo Usuario. 
	 */
	public Usuario(String nombre, String email) {
		super(nombre, email);
	}
	
	/*
	 * Muestra los detalles del Usuario.
	 */
	public String toString() {
        return "Usuario: " + nombre  + " >> " + email;
    }
}
