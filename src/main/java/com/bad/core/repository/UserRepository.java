package com.bad.core.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bad.core.entity.Users;
import com.bad.core.entity.Authority;

@Repository
public interface UserRepository extends CrudRepository<Users, Long>{
	public Optional<Users> findByUsername(String username);
	public Users findOne(Long id);
	public List<Users> findAll();
	
	//public void save (Users user);
	
}