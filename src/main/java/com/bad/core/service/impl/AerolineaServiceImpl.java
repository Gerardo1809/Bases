package com.bad.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.bad.core.common.GenericServiceImpl;
import com.bad.core.entity.Servicio_Aereo;
import com.bad.core.repository.AerolineaRepository;
import com.bad.core.service.AerolineaService;

@Service
public class AerolineaServiceImpl extends GenericServiceImpl<Servicio_Aereo,Long> implements AerolineaService{
	
	
	@Autowired
	private AerolineaRepository aerolinearepository;
	
	@Override
	public CrudRepository<Servicio_Aereo,Long> getDao(){
		return aerolinearepository;
	}

}
