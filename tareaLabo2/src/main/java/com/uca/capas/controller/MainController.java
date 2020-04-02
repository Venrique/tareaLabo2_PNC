package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "login";
	}

	
	@PostMapping("/validacion")
	public String mensaje(Usuario usuario) {
		String user  = "victor";
		String pass = "1234";
		
		if(usuario.getUsuario().equals(user) && usuario.getContrasenia().equals(pass)) {
			return "MostrarMensajeV";
		}else {
			return "MostrarMensajeF";
		}
	}
}
