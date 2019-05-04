package com.bad.core.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bad.core.entity.Authority;
import com.bad.core.repository.RolRepository;

@Service
public class RolDeailsServiceImpl implements RolRepository {

	@PersistenceContext
	private EntityManager em;
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Authority> findAll() {
		return em.createQuery("from Authority").getResultList() ;
	}

}
