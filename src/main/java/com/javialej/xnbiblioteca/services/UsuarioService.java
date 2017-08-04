package com.javialej.xnbiblioteca.services;

import java.util.List;

import com.javialej.xnbiblioteca.model.Usuario;

public interface UsuarioService {
	
	void agregarUsuario(Usuario usuario); 				// saveBook
	
	int numeroDeLibrosPrestados(Long id_persona);		// numberOfBooks  
	
	List<Usuario> buscarPorNombre(String nombre);	// findByTitle
	
	List<Usuario> buscarPorEmail(String email);  		// findByAuthor
}
