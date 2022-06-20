package appmockito.service;

import java.util.List;
import java.util.Optional;

import appmockito.model.Examen;
import appmockito.repositories.ExamenRepository;
import appmockito.repositories.PreguntasRepository;

public class  ExamenServiceImp implements ExamenService {
	private ExamenRepository examenRepository;
	private PreguntasRepository preguntasRepository;
	
	public ExamenServiceImp() {
		super();
		
	}
	
	public ExamenServiceImp(ExamenRepository examenRepository, PreguntasRepository preguntasRepository) {
		super();
		this.examenRepository=examenRepository;
		this.preguntasRepository=preguntasRepository;
	}
	
	@Override
	public Optional<Examen> findExamenPorNombre(String nombre){
		Optional<Examen>examenOptional=examenRepository.findAll()
				.stream()
				.filter(e->e.getNombre().contains(nombre))
				.findFirst();
		Examen examen=null;
	
		return examenOptional; 
	}
	
	@Override
	public Examen findExamenPorNombrePreguntas(String nombre){
		Optional<Examen>examenOptional=findExamenPorNombre(nombre);
		Examen examen = null;
		if(examenOptional.isPresent()) {
			examen=examenOptional.orElseThrow();
			List<String>preguntas=preguntasRepository.findPreguntasPorExamenId(examen.getId());
			examen.setPreguntas(preguntas);
			
		}
		return examen;
	}
	

}
