package com.bad.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bad.core.repository.RolRepository;

@Controller
public class RolController {
	
	@Autowired
	private RolRepository rolRepository;
	
	@GetMapping("/listarRoles")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Roles");
		model.addAttribute("comentario","Detalle de Roles ");
		model.addAttribute("roles", rolRepository.findAll());
		return "Rol/listar";
	}
}
