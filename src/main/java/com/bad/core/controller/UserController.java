package com.bad.core.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bad.core.entity.Users;
import com.bad.core.repository.RolRepository;
import com.bad.core.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository uc;
	
    @RequestMapping(value="/listaUsers", method = RequestMethod.GET)
    public String listaUsuarios(ModelMap mp){
    	mp.addAttribute("titulo", "Listado de Usuarios");
    	mp.addAttribute("comentario","Detalle de Usuarios ");
        mp.put("user", uc.findAll());
        return "/Users/lista";
    }
	
	@GetMapping(value ="/listaUsers/nuevo")
	public String nuevo(Map<String, Object> model) {
		Users user = new Users();
		model.put("user", user);
		model.put("titulo", "Formulario de Usuarios");
		model.put("comentario", "Llene los datos");
	    return "/Users/nuevo";
	}
	
	@RequestMapping(value = "/listaUsers/nuevo", method = RequestMethod.POST)
	public String guardar(Users user) {
		uc.save(user);
		return "redirect:/listaUsers";
	}
	
}
