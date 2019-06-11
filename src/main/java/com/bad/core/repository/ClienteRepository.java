package com.bad.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bad.core.entity.Authority;
import com.bad.core.entity.Cliente;
import com.bad.core.entity.Privilege;



@Repository
public interface ClienteRepository extends CrudRepository <Cliente,Long> {
	
	@Query(value="select * from cliente c where c.telefonomovil = 71",nativeQuery=true)
	public List<Cliente>findNative();
	
}
