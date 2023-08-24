package com.project.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.backend.model.Carro;

@Service
public interface CarroService {

	//create carro
	public Carro createUser(Carro carro);
	
	//read carros - Listar
	public List<Carro> getCarro();
	
	//read carros by id - Listar pelo id
	public Carro getCarroById(long id);
	
	//delete carro by id
	public void deleteCarro(long id);
	
	//update carro by id
	public Carro updateCarro(Carro carro, long id);
}
