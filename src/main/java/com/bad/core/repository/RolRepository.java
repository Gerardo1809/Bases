package com.bad.core.repository;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.bad.core.entity.Authority;
import com.bad.core.entity.Privilege;

@Repository
public interface RolRepository{
	public List<Authority> findAll();
	public Authority findOne(Long id);	
	public List<Privilege> findAllPrivilege();

}
