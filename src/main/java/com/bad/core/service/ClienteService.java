package com.bad.core.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bad.core.common.GenericService;
import com.bad.core.entity.Cliente;

public interface ClienteService extends GenericService<Cliente,Long>{

	public List<Cliente>findNative();
}
