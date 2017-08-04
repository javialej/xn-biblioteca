package com.javialej.xnbiblioteca.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.javialej.xnbiblioteca.model.Libro;
import com.javialej.xnbiblioteca.model.Usuario;

@Repository
@Transactional
public class UsuarioDAOImplementation extends AbstractSession implements UsuarioDAO {

	@Override
	public void agregarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		getSession().persist(usuario);
	}

	@Override
	public int numeroDeLibrosPrestados(Long id_persona) {
		// TODO Auto-generated method stub
		return (int) getSession().createQuery("from prestamo where id_persona = :id_persona")
				.setParameter("id_persona", id_persona).list().size(); 				
	}

	@Override
	public List<Usuario> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return (List<Usuario>) getSession().createQuery("from usuario where nombre = :nombre")
				.setParameter("nombre", nombre).list();
	}

	@Override
	public List<Usuario> buscarPorEmail(String email) {
		// TODO Auto-generated method stub
		return (List<Usuario>) getSession().createQuery("from usuario where email = :email")
				.setParameter("email", email).list();
	}
}
