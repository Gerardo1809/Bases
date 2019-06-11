package com.bad.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bad.core.entity.Servicio_Aereo;
import com.bad.core.repository.ClienteRepository;
import com.bad.core.service.AerolineaService;

@Controller
public class AerolineaController {

	@Autowired
	private AerolineaService aerolineaservice;
	
	
	
	
	@RequestMapping(value="/listarAerolineas", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Clientes");
		model.addAttribute("comentario","Detalle de Clientes ");
		model.addAttribute("aero", aerolineaservice.getAll());
		return "/Aerolinea/Lista";
	}
	
	
	@GetMapping(value ="/guarda/{codigo}")
	public String showSave(@PathVariable("codigo") Long codigo,Model model) {
		
		if(codigo != null && codigo != 0) {
			model.addAttribute("aero", aerolineaservice.get(codigo));
		}else {
			model.addAttribute("aero", new Servicio_Aereo());
		}
		
		return "/Aerolinea/save";
	}
	
	@PostMapping("/guarda")
	public String save(Servicio_Aereo aero,Model model) {
		aerolineaservice.save(aero);
		return "/Aerolinea/Lista";
	}
	
	@GetMapping("/delete/{codigo}")
	public String delete(@PathVariable("codigo") Long codigo,Model model) {
		aerolineaservice.delete(codigo);
		return "/Aerolinea/Lista";
	}
	
}
