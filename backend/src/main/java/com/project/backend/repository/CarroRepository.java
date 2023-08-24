package com.project.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.backend.model.Carro;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Long> {

}
