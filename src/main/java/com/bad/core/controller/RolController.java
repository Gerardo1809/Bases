package com.bad.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bad.core.entity.Authority;
import com.bad.core.entity.Privilege;
import com.bad.core.repository.RolRepository;

@Controller
public class RolController{
	
	@Autowired
	private RolRepository rolRepository;
	
	@GetMapping("/listarRoles")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Roles");
		model.addAttribute("comentario","Detalle de Roles ");
		model.addAttribute("roles", rolRepository.findAll());
		return "Rol/listar";
	}
	@GetMapping("/verRol/{id}")
	public String ver(Model model, @PathVariable("id") String id) {
		model.addAttribute("titulo", "Detalle de Rol");
		model.addAttribute("comentario","Detalle de Rol ");
		model.addAttribute("privilegios", rolRepository.findAllPrivilege());
		Authority authority=rolRepository.findOne(Long.parseLong(id));
		
		model.addAttribute("privilegiosAsignados", authority.getPrivileges());
		
		model.addAttribute("rol", rolRepository.findOne(Long.parseLong(id)));
		return "Rol/ver";
		
	}
	@GetMapping("/test")
	public String verTest(Model model) {
		
		Authority authority=rolRepository.findOne((long)1);
		model.addAttribute("pruebas", authority.getPrivileges());
		System.out.println(authority.getPrivileges());
		return "prueba";
	}
	
	@PostMapping("rol/{id}/privilegio_habilitar")
	public String habilitar(@PathVariable("id") String id,@RequestParam("idPrivilegio") Long idPrivilegio) {
		
		Authority authority= rolRepository.findOne(Long.parseLong(id));
		List<Privilege> listaPrivilegios= authority.getPrivileges();
		
		for (Privilege privilege : listaPrivilegios) {
			if(privilege.getId()==idPrivilegio) {
				
			}
		}
		
		return "redirect:Rol/ver";
	}
}
