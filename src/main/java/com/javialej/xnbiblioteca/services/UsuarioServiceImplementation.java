package com.javialej.xnbiblioteca.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javialej.xnbiblioteca.dao.UsuarioDAO;
import com.javialej.xnbiblioteca.model.Usuario;

@Service("usuarioService")
@Transactional
public class UsuarioServiceImplementation implements UsuarioService{

	@Autowired
	private UsuarioDAO _usuarioDAO;
	
	@Override
	public void agregarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		_usuarioDAO.agregarUsuario(usuario);
	}

	@Override
	public int numeroDeLibrosPrestados(Long id_persona) {
		// TODO Auto-generated method stub
		return _usuarioDAO.numeroDeLibrosPrestados(id_persona);
	}

	@Override
	public List<Usuario> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return _usuarioDAO.buscarPorNombre(nombre);
	}

	@Override
	public List<Usuario> buscarPorEmail(String email) {
		// TODO Auto-generated method stub
		return _usuarioDAO.buscarPorEmail(email);
	}

	@Override
	public Usuario buscarUsuarioPorId(Long id_persona) {
		// TODO Auto-generated method stub
		return _usuarioDAO.buscarUsuarioPorId(id_persona);
	}
}
