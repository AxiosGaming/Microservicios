package com.carro.service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.carro.service.entidades.Moto;
import com.carro.service.repositorio.motoRepository;

@Service
public class MotoService {
	
	@Autowired
	private motoRepository motoRepositorio;
	
	public List<Moto> getAll(){
		
		return motoRepositorio.findAll();
	}
	
	public Moto getMotoById(int id) {
		return motoRepositorio.findById(id).orElse(null);
	}
	
	public Moto save(Moto moto) {
		Moto nuevoMoto= motoRepositorio.save(moto);
		
		return nuevoMoto;
	}
	
	public List<Moto> byUsuarioById(int usuarioId){
		return motoRepositorio.findByUsuarioId(usuarioId);
	}
}
