package com.bad.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bad.core.entity.Servicio_Aereo;

@Repository
public interface AerolineaRepository extends CrudRepository <Servicio_Aereo,Long>{

}
