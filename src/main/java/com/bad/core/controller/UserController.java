package com.bad.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bad.core.repository.RolRepository;
import com.bad.core.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/listaUsers")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Usuarios");
		model.addAttribute("comentario","Detalle de Usuarios ");
		model.addAttribute("user", userRepository.findAll());
		return "/Users/lista";
	}
}
