package com.javialej.xnbiblioteca.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.javialej.xnbiblioteca.model.Libro;

@Repository
@Transactional
public class LibroDAOImplementation extends AbstractSession implements LibroDAO{

	@Override
	public void agregarLibro(Libro libro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Libro> buscarPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> buscarPorAutor(String autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> mostrarLibros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean consultarDisponibilidadLibro() {
		// TODO Auto-generated method stub
		return false;
	}

}
