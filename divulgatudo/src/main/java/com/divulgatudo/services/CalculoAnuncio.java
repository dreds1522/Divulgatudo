package com.divulgatudo.services;



//@Service
public class CalculoAnuncio {

	public static Double pessoasPorValor(Double valor) {
		// valor R$ = 30
		Double retorno = new Double(0);
		retorno = 30* valor;
		
		return retorno;
	}
	
	public static Double totalCompartilhamento(Double pessoas) {
		
		Double retorno = new Double(0);
		retorno = (pessoas * 3)/20;
		return retorno;
	}
	
	
	public static Double visualizacaoPorCompartilhamento(Double pessoas) {
		
		Double retorno = new Double(0);
		retorno = 40. * pessoas;
		return retorno;
	}
	
	public static Double pessoasProClick(Double pessoas) {
		
		Double retorno = new Double(0);
		retorno = (12*pessoas)/100;
		return retorno;
	}
	
	public static Double sequenciaDeVisualicao(Double pessoas) {
		
		Double retorno = new Double(0);
		retorno = pessoas * 4.;
		return retorno;
	}
}
