package com.bad.core.common;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;

public interface GenericService<T,ID extends Serializable> {

	T save(T entity);
	
	void delete(ID id);
	
	T get(ID id);
	
	List<T> getAll();
	
	
}
