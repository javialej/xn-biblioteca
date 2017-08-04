package com.javialej.xnbiblioteca.dao;

import java.util.List;

import com.javialej.xnbiblioteca.model.Usuario;

public interface UsuarioDAO {
	
	void agregarUsuario(Usuario usuario); 				// saveUser
	
	int numeroDeLibrosPrestados(Long id_persona);		// numberOfUser  
	
	List<Usuario> buscarPorNombre(String nombre);		// findByName
	
	List<Usuario> buscarPorEmail(String email);  		// findByEmail
	
	Usuario buscarUsuarioPorId(Long id_persona);
	/* ------------------------------------------------------------ */
	
	// void quitarUsuario(Long id_persona); 			// deleteUser
	
	// void actualizarUsuario(Usuario usuario); 		// updateUser
}
