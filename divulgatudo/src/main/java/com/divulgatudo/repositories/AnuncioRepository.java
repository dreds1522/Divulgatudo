package com.divulgatudo.repositories;



import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.divulgatudo.entities.Anuncio;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
	
	//List<Anuncio> findAllByOrderByNameAsc();
	@Query("SELECT obj FROM Anuncio obj "
			+ " WHERE obj.cliente = :pCliente ORDER BY id ")
	List<Anuncio> findByForenameAndSurname(
				@Param("pCliente") String cliente);
	
	@Query("SELECT obj FROM Anuncio obj "
			+ " WHERE obj.dataInicio >= :pDtInicio and obj.dataTermino <= :pDtFim ORDER BY id ")
	List<Anuncio> findByDate(
				@Param("pDtInicio") Date dtInicio,
				@Param("pDtFim") Date dtFim);

}
