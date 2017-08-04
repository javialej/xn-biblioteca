package com.javialej.xnbiblioteca.services;

import java.util.List;

import com.javialej.xnbiblioteca.model.Libro;

public interface LibroService {
	
	void agregarLibro(Libro libro); 			// saveBook	
	
	List<Libro> buscarPorTitulo(String titulo);	// findByTitle
	
	List<Libro> buscarPorAutor(String autor);  	// findByAuthor
	
	List<Libro> mostrarLibros();  				// findAllBooks
	
	boolean consultarDisponibilidadLibro(Long id_texto);		// findByBookAvailability
	
	Libro buscarLibroPorId(Long id_texto);
}
