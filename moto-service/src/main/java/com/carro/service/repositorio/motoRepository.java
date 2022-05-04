package com.carro.service.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carro.service.entidades.Moto;

public interface motoRepository extends JpaRepository<Moto, Integer>{
	
	List<Moto> findByUsuarioId(int usuarioId);
}
