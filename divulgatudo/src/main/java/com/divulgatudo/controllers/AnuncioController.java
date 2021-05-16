package com.divulgatudo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.divulgatudo.dto.AnuncioDTO;
import com.divulgatudo.dto.FiltroDTO;
import com.divulgatudo.services.AnuncioService;

@RestController
@RequestMapping(value = "/anuncio")
public class AnuncioController {

	@Autowired
	AnuncioService anuncioService;
	
	
	@GetMapping
	public ResponseEntity<List<AnuncioDTO>> findAll(){
		List<AnuncioDTO> list = anuncioService.findAll();
		return ResponseEntity.ok().body(list);	
	}
	
	@PostMapping
	public ResponseEntity<AnuncioDTO> insert(@RequestBody AnuncioDTO dto){
		dto = anuncioService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);	
	}
	
	
	@PostMapping(path = "/cliente", consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<AnuncioDTO>> findAllUsersWithPagination(@RequestBody FiltroDTO dto){
		List<AnuncioDTO> list = anuncioService.findCliente(dto);
		return ResponseEntity.ok().body(list);	
	}
	
}
