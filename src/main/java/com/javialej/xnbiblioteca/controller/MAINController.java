package com.javialej.xnbiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MAINController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String response = "<h1><b> XN-Biblioteca </b></h1><h3> Bienvenido al Servidor Back-End </h3> ";
		return response;
	}
}
