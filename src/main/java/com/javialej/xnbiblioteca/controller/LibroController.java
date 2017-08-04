package com.javialej.xnbiblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javialej.xnbiblioteca.model.Libro;
import com.javialej.xnbiblioteca.services.LibroService;

@Controller
@RequestMapping("/v1")
public class LibroController {
	
	@Autowired
	private LibroService _libroService;
	
	// GET libros, muestra todos los libros
	// GET libro ? titulo, busca el libro por titulo.
	// GET libro ? autor, busca el libro por autor.
	@RequestMapping(value = "/libros", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Libro>> getLibros(@RequestParam(value = "titulo", required = false) String titulo, @RequestParam(value="autor", required=false) String autor) {
		List<Libro> libros = new ArrayList<Libro>();
		
		// Busca por Titulo
		if(titulo != null) {
			libros = _libroService.buscarPorTitulo(titulo);
			
			if(libros.isEmpty()) {
				return new ResponseEntity("No se encontraron libros con el titulo: "+titulo, HttpStatus.NO_CONTENT);
			}
		}
		
		// Busca por Autor
		if(autor != null) {
			libros = _libroService.buscarPorAutor(autor);
			
			if(libros.isEmpty()) {
				return new ResponseEntity("No se encontraron libros del autor: "+autor, HttpStatus.NO_CONTENT);
			}
		}
		
		// Muestra todos los libros que tiene la biblioteca
		if(titulo == null && autor == null) {
			libros = _libroService.mostrarLibros();
			if(libros.isEmpty()) {
				return new ResponseEntity("No hay libros.", HttpStatus.NO_CONTENT);
			}
		}
				
		return new ResponseEntity<List<Libro>>(libros, HttpStatus.OK);
	}
	
	// GET libro/{id}, busca el libro por su Id.
	// GET libro/{id} ? check, devuelve la disponibilidad del libro.
	@RequestMapping(value = "/libros/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<?> buscarLibroPorId(@PathVariable("id") Long id, @RequestParam(value = "check", required = false) String check){

		if (id == null || id <= 0) {
			return new ResponseEntity("El id es requerido para buscar el libro.", HttpStatus.CONFLICT);
		}
		
		Libro libro = _libroService.buscarLibroPorId(id);
		
		if(libro == null) {
			return new ResponseEntity("El libro no fué encontrado.", HttpStatus.NOT_FOUND);
		}
				
		if(check != null) {
			boolean disponible = _libroService.consultarDisponibilidadLibro(id);
			return new ResponseEntity(disponible, HttpStatus.OK);	
		}
		
		return new ResponseEntity<Libro>(libro, HttpStatus.OK);
	}
	
	// POST libro, agrega un libro.
	@RequestMapping(value = "/libros", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<?> agregarLibro(@RequestBody Libro libro, UriComponentsBuilder ucBuilder) {
		if(_libroService.buscarPorTitulo(libro.getTitulo()) != null) {
			return new ResponseEntity("Incapaz de agregar el libro. El libro con el titulo: "
					+ libro.getTitulo()+" ya existe.", HttpStatus.CONFLICT);
		}
		
		_libroService.agregarLibro(libro);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/v1/libros/{id}").buildAndExpand(libro.getIdTexto()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);		
	}
}
