package com.project.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="cadastrodecarro")
public class Carro {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String placa;
	private String renavam;
	private String marca;
	private String modelo;
	private String anodefabricacao;
	private String anodemodelo;
	private String cor;
	private String combustivel;
	private String quilometragem;
	private String tipo;
	private String valordecompra;
	private String anexodoc;
	private String datadeentrada;
	private String idcliente;
	
	public long getId() {
		return id;
	}
	public void setId(long idcar) {
		this.id = idcar;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnodefabricacao() {
		return anodefabricacao;
	}
	public void setAnodefabricacao(String anodefabricacao) {
		this.anodefabricacao = anodefabricacao;
	}
	public String getAnodemodelo() {
		return anodemodelo;
	}
	public void setAnodemodelo(String anodemodelo) {
		this.anodemodelo = anodemodelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValordecompra() {
		return valordecompra;
	}
	public void setValordecompra(String valordecompra) {
		this.valordecompra = valordecompra;
	}
	public String getAnexodoc() {
		return anexodoc;
	}
	public void setAnexodoc(String anexodoc) {
		this.anexodoc = anexodoc;
	}
	public String getDatadeentrada() {
		return datadeentrada;
	}
	public void setDatadeentrada(String datadeentrada) {
		this.datadeentrada = datadeentrada;
	}
	public String getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}
	
	
}
