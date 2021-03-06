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
		getSession().persist(libro);
	}

	@Override
	public List<Libro> buscarPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return (List<Libro>) getSession().createQuery("from Libro where titulo = :titulo")
				.setParameter("titulo", titulo).list();
	}

	@Override
	public List<Libro> buscarPorAutor(String autor) {
		// TODO Auto-generated method stub
		return (List<Libro>) getSession().createQuery("from Libro where autor = :autor")
				.setParameter("autor", autor).list();
	}

	@Override
	public List<Libro> mostrarLibros() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Libro").list();
	}

	@Override
	public boolean consultarDisponibilidadLibro(Long id_texto) {
		// TODO Auto-generated method stub		
		return (boolean) getSession().createQuery("select disponible from Libro where id_texto = :id_texto").setParameter("id_texto", id_texto).uniqueResult(); 
	}

	@Override
	public Libro buscarLibroPorId(Long id_texto) {
		// TODO Auto-generated method stub
		return (Libro) getSession().get(Libro.class, id_texto);
	}

}
