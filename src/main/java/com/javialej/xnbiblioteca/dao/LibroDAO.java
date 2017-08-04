package com.javialej.xnbiblioteca.dao;

import java.util.List;

import com.javialej.xnbiblioteca.model.Libro;

public interface LibroDAO {
	
	void agregarLibro(Libro libro); 			// saveBook	
	
	List<Libro> buscarPorTitulo(String titulo);	// findByTitle
	
	List<Libro> buscarPorAutor(String autor);  	// findByAuthor
	
	List<Libro> mostrarLibros();  				// findAllBooks
	
	boolean consultarDisponibilidadLibro(Long id_teacher);		// findByBookAvailability
	
	/* ------------------------------------------------------------ */
	
	// void quitarLibro(Long id_texto); 			// deleteBook 
	
	// void actualizarLibro(Libro libro); 			// updateLibro
}
