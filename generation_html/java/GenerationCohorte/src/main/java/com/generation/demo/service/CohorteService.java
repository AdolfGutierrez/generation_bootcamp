package com.generation.demo.service;

import java.util.List;
import java.util.Map;

import com.generation.demo.model.Cohorte;

public interface CohorteService {
	
//	tiene metodos vacios o abstractos y las clases que lo implementen
//	deben cumplir con los metodos vacios declarados
	
	//LEER
	Cohorte getCohorte(Integer id);//leer una sola cohorte con el id indicado
	
	List<Cohorte> conseguirCohortes();//leer todas las cohortes
	List<Cohorte> getCohorteByCiudad(String ciudad);
	List<Map<String, Object>>getInstructorAlumno();
	
	
	
	//ESCRIBIR
	Cohorte saveCohorte(Cohorte cohorte);//guarda la cohorte enviada
	
	
	//ACTURALIZAR
	
	
	//BORRAR
}
