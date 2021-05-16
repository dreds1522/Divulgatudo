package com.divulgatudo.dto;

import java.io.Serializable;
import java.util.Date;

import com.divulgatudo.entities.Anuncio;

public class AnuncioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3570032060094137298L;
	
	private Integer id;
	private String nome;
	private String cliente;
	private Date dataInicio;
	private Date dataTermino;
	private Float  investimentoDia;
	
	public AnuncioDTO() {
		super();
	}

	public AnuncioDTO(Integer id, String nome, String cliente, Date dataInicio, Date dataTermino) {
		super();
		this.id = id;
		this.nome = nome;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
	}
	
	
	
	
	public AnuncioDTO(Integer id, String nome, String cliente, Date dataInicio, Date dataTermino,
			Float  investimentoDia) {
		super();
		this.id = id;
		this.nome = nome;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.investimentoDia = investimentoDia;
	}

	public AnuncioDTO(Anuncio anuncio) {
		super();
		this.id = anuncio.getId();
		this.nome = anuncio.getNome();
		this.cliente = anuncio.getCliente();
		this.dataInicio = anuncio.getDataInicio();
		this.dataTermino = anuncio.getDataTermino();
		this.investimentoDia =  anuncio.getInvestimentoDia();
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Float  getInvestimentoDia() {
		return investimentoDia;
	}

	public void setInvestimentoDia(Float  investimentoDia) {
		this.investimentoDia = investimentoDia;
	}
	
	
	

}
