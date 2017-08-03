package com.javialej.xnbiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MAINController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String response = "<h2> Bienvenido al Servidor Back-End </h2> <h1><b> XN-Biblioteca </b></h1>";
		return response;
	}
}
