package com.bad.core.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bad.core.entity.Authority;

@Repository
public interface RolRepository {
	public List<Authority> findAll();
}
