package com.javialej.xnbiblioteca.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javialej.xnbiblioteca.dao.LibroDAO;
import com.javialej.xnbiblioteca.model.Libro;

@Service("libroService")
@Transactional
public class LibroServiceImplementation implements LibroService{

	@Autowired
	private LibroDAO _libroDAO;
	
	@Override
	public void agregarLibro(Libro libro) {
		// TODO Auto-generated method stub
		_libroDAO.agregarLibro(libro);
	}

	@Override
	public List<Libro> buscarPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return _libroDAO.buscarPorTitulo(titulo);
	}

	@Override
	public List<Libro> buscarPorAutor(String autor) {
		// TODO Auto-generated method stub
		return _libroDAO.buscarPorAutor(autor);
	}

	@Override
	public List<Libro> mostrarLibros() {
		// TODO Auto-generated method stub
		return _libroDAO.mostrarLibros();
	}

	@Override
	public boolean consultarDisponibilidadLibro(Long id_texto) {
		// TODO Auto-generated method stub
		return _libroDAO.consultarDisponibilidadLibro(id_texto);
	}
	
	@Override
	public Libro buscarLibroPorId(Long id_texto) {
		// TODO Auto-generated method stub
		return _libroDAO.buscarLibroPorId(id_texto);
	}
}
