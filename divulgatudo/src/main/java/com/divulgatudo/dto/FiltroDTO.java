package com.divulgatudo.dto;

import java.io.Serializable;
import java.util.Date;

public class FiltroDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7489903127459681269L;
	
	private String Cliente;
	private Date dataInicio;
	private Date dataFim;
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	
	

}
