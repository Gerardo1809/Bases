package com.bad.core.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.bad.core.common.GenericService;
import com.bad.core.common.GenericServiceImpl;
import com.bad.core.entity.Cliente;
import com.bad.core.repository.ClienteRepository;
import com.bad.core.service.ClienteService;

@Service
public class ClienteDetailServiceImpl extends GenericServiceImpl<Cliente,Long> implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public CrudRepository<Cliente,Long> getDao(){
		return clienteRepository;
	}
	
	
	public List<Cliente>findNative(){
		return clienteRepository.findNative();
	}
	
}
