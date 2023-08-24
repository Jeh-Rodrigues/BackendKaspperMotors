package com.project.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.backend.model.Carro;
import com.project.backend.repository.CarroRepository;

@Service
public class CarroServiceImpl implements CarroService {

	@Autowired
	private CarroRepository carroRepository;
	@Override
	public Carro createUser(Carro user) {
		return carroRepository.save(user);
	}

	@Override
	public List<Carro> getCarro() {
		return (List<Carro>) carroRepository.findAll();
	}

	@Override
	public Carro getCarroById(long id) {
		return carroRepository.findById(id).get();
	}

	@Override
	public void deleteCarro(long id) {
		carroRepository.deleteById(id);
		
	}

	@Override
	public Carro updateCarro(Carro user, long id) {
		Carro carro = carroRepository.findById(id).get();
		carro.setPlaca(carro.getPlaca());
		carro.setRenavam(carro.getRenavam());
		carro.setMarca(carro.getMarca());
		carro.setModelo(carro.getModelo());
		carro.setAnodefabricacao(carro.getAnodefabricacao());
		carro.setAnodemodelo(carro.getAnodemodelo());
		carro.setCor(carro.getCor());
		carro.setCombustivel(carro.getCombustivel());
		carro.setQuilometragem(carro.getQuilometragem());
		carro.setTipo(carro.getTipo());
		carro.setValordecompra(carro.getValordecompra());
		carro.setAnexodoc(carro.getAnexodoc());
		carro.setDatadeentrada(carro.getDatadeentrada());
		carro.setIdcliente(carro.getIdcliente());
		
		return carroRepository.save(carro);
	}

}
