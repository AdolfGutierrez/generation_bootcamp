package appmockito.service;

import java.util.Optional;

import appmockito.model.Examen;

public interface ExamenService {
	
	Optional<Examen>findExamenPorNombre(String nombre);
	Examen findExamenPorNombrePreguntas(String nombre);
	

}
