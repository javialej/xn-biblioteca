package com.javialej.xnbiblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.javialej.xnbiblioteca.model.Usuario;
import com.javialej.xnbiblioteca.services.UsuarioService;

@Controller
@RequestMapping("/v1")
public class UsuarioController {
	
	@Autowired
	private UsuarioService _usuarioService;
	
	// GET usuario ? nombre, busca el usuario por nombre.
	// GET usuario ? email, busca el usuario por email.
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Usuario>> getUsuarios(@RequestParam(value = "nombre", required = false) String nombre, @RequestParam(value="email", required=false) String email) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		// Busca por Nombre
		if(nombre != null) {
			usuarios = _usuarioService.buscarPorNombre(nombre);
			
			if(usuarios.isEmpty()) {
				return new ResponseEntity("No se encontraron usuarios con el nombre: "+nombre, HttpStatus.NO_CONTENT);
			}
		}
		
		// Busca por Email
		if(email != null) {
			usuarios = _usuarioService.buscarPorEmail(email);
			
			if(usuarios.isEmpty()) {
				return new ResponseEntity("No se encontraron usuarios con el email: "+email, HttpStatus.NO_CONTENT);
			}
		}
						
		return new ResponseEntity(usuarios, HttpStatus.OK);
	}
	
	
	// GET usuario/{id}, busca el usuario por su Id.
	@RequestMapping(value = "/usuarios/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<?> buscarUsuarioPorId(@PathVariable("id") Long id){
		
		if (id == null || id <= 0) {
			return new ResponseEntity("El id es requerido para buscar el usuario.", HttpStatus.CONFLICT);
		}
		
		Usuario usuario = _usuarioService.buscarUsuarioPorId(id);		
		if(usuario == null) {
			return new ResponseEntity("El usuario no fué encontrado.", HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}
	
	// POST usuario, agrega un usuario.
	@RequestMapping(value = "/usuarios", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<?> agregarUsuario(@RequestBody Usuario usuario, UriComponentsBuilder ucBuilder) {
		if(_usuarioService.buscarPorEmail(usuario.getEmail()) != null) {
			return new ResponseEntity("Incapaz de agregar el usuario. El usuario con el email "
					+ usuario.getEmail()+" ya existe.", HttpStatus.CONFLICT);
		}
		
		_usuarioService.agregarUsuario(usuario);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/v1/usuarios/{id}").buildAndExpand(usuario.getIdPersona()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);		
	}
	
}
