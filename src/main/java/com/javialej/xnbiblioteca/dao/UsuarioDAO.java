package com.javialej.xnbiblioteca.dao;

import java.util.List;

import com.javialej.xnbiblioteca.model.Usuario;

public interface UsuarioDAO {
	
	void agregarUsuario(Usuario usuario); 				// saveBook
	
	int numeroDeLibrosPrestados(Long id_persona);		// numberOfBooks  
	
	List<Usuario> buscarPorNombre(String nombre);	// findByTitle
	
	List<Usuario> buscarPorEmail(String email);  		// findByAuthor
	
	/* ------------------------------------------------------------ */
	
	// void quitarUsuario(Long id_persona); 			// deleteBook 
	
	// void actualizarUsuario(Usuario usuario); 		// updateLibro
}
