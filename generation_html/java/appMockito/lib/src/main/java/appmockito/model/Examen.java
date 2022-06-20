package appmockito.model;

import java.util.List;
import java.util.ArrayList;

public class Examen {
	private long id; 
	private String nombre;
	private List<String>preguntas;
	
//	constructor para crear el objeto 
	
	public Examen() {
		
	}
	public Examen(long id, String nombre) {
		this.id= id;
		this.nombre=nombre; 
		this.preguntas=new ArrayList<>();
		
	}
//	 setters and getters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<String> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(List<String> preguntas) {
		this.preguntas = preguntas;
	}
	

}
