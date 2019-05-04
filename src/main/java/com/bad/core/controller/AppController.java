package com.bad.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Home");
		return "index";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("titulo", "Inicio de Sesión");
		return "login";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
}