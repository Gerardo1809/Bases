package com.bad.core.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bad.core.entity.Cliente;
import com.bad.core.entity.Servicio_Aereo;
import com.bad.core.entity.Users;
import com.bad.core.repository.ClienteRepository;
import com.bad.core.service.ClienteService;
import com.bad.core.service.impl.ClienteDetailServiceImpl;

@Controller
public class ClienteController {
	 
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ClienteRepository repo;
	
	
	@RequestMapping(value="/listarClientes", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Clientes");
		model.addAttribute("comentario","Detalle de Clientes ");
		model.addAttribute("clientes", repo.findNative());
		return "/Cliente/Lista";
	}
	
	@GetMapping(value ="/guardarCliente/{id_cliente}")
	public String showSave(@PathVariable("id_cliente") Long id_cliente,Model model) {
		
		if(id_cliente != null && id_cliente != 0) {
			model.addAttribute("cliente", clienteService.get(id_cliente));
		}else {
			model.addAttribute("cliente", new Servicio_Aereo());
		}
		
		return "/Cliente/save";
	}
	
	@PostMapping("/guardar")
	public String save(Cliente cliente,Model model) {
		clienteService.save(cliente);
		return "/Cliente/Lista";
	}
	
	@GetMapping("/delete/{id_cliente}")
	public String delete(@PathVariable("id_cliente") Long id_cliente,Model model) {
		clienteService.delete(id_cliente);
		return "/Cliente/Lista";
	}
	
	
}
