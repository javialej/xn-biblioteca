package com.javialej.xnbiblioteca.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.javialej.xnbiblioteca.model.Usuario;

@Repository
@Transactional
public class UsuarioDAOImplementation extends AbstractSession implements UsuarioDAO {

	@Override
	public void agregarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int numeroDeLibrosPrestados(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Usuario> buscarPorNombreTitulo(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> buscarPorEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
