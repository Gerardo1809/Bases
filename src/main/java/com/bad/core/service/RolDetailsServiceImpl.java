package com.bad.core.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bad.core.entity.Authority;
import com.bad.core.entity.Privilege;
import com.bad.core.repository.RolRepository;
@Service
public class RolDetailsServiceImpl implements RolRepository {

	@PersistenceContext
	private EntityManager em;
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Authority> findAll() {
		return em.createQuery("from Authority").getResultList() ;
	}
	
	@Override
	@Transactional(readOnly=true)
	public Authority findOne(Long id) {
		return em.find(Authority.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<Privilege> findAllPrivilege() {
		return em.createQuery("from Privilege").getResultList();
	}
	

}
