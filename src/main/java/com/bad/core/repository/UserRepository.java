package com.bad.core.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bad.core.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
	public Optional<Users> findByUsername(String username);
}