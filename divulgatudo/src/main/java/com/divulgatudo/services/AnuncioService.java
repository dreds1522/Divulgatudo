package com.divulgatudo.services;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divulgatudo.dto.AnuncioDTO;
import com.divulgatudo.dto.FiltroDTO;
import com.divulgatudo.entities.Anuncio;
import com.divulgatudo.repositories.AnuncioRepository;


@Service
public class AnuncioService {
	
	@Autowired
	AnuncioRepository anuncioRepository;

	@Transactional
	public List<AnuncioDTO> findAll(){
		List<Anuncio> list = anuncioRepository.findAll();
		return list.stream().map(x -> new AnuncioDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public AnuncioDTO insert(AnuncioDTO dto){
		Anuncio anuncio = new Anuncio(dto.getId(), dto.getNome(), dto.getCliente(),dto.getInvestimentoDia(), dto.getDataInicio(), dto.getDataTermino());
		
		anuncio = anuncioRepository.save(anuncio);
		return new AnuncioDTO(anuncio);
	}
	
	@Transactional
	public List<AnuncioDTO> findCliente(FiltroDTO dto){
		List<Anuncio> list =  new ArrayList<>();
		if(null != dto.getCliente()) {
			list = anuncioRepository.findByForenameAndSurname(dto.getCliente());
		}else {
			list = anuncioRepository.findByDate(dto.getDataInicio(), dto.getDataFim());
		}
			
		return list.stream().map(x -> new AnuncioDTO(x)).collect(Collectors.toList());
	}
	
	
	
	/*
	@Transactional
	public OrderDTO setDelivered(Long id){
		Order order = repository.getOne(id);
		order.setStatus(OrderStatus.DELIVERED);
		order = repository.save(order);
		return new OrderDTO(order);
	}
	*/
}
