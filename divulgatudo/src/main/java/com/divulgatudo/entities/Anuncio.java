package com.divulgatudo.entities;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;





@Entity
@Table(name="tb_anuncio")
public class Anuncio implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4074503494787892646L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cliente;
	private Float  investimentoDia;
	
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	 
	@Temporal(TemporalType.DATE)
	private Date dataTermino;
	
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCliente() {
		return cliente;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
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
	
	public Anuncio(Integer id, String nome, String cliente, Date dataInicio, Date dataTermino) {
		
		this.id = id;
		this.nome = nome;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
	}
	
	
	public Anuncio(Integer id, String nome, String cliente, Float  investimentoDia, Date dataInicio, Date dataTermino) {
		super();
		this.id = id;
		this.nome = nome;
		this.cliente = cliente;
		this.investimentoDia = investimentoDia;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
	}
	public Anuncio() {
		super();
	}
	
	
	
	
	

}
