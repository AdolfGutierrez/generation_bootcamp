package com.generation.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// CREACION DE LA TABLA COHORTE (CLASE) CON SUS ATRIBUTOS (COLUMNAS) 

@Entity // representación de la información
@Table(name="cohorte")
public class Cohorte {
	
	@Id //prymari key del id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//auto increment
	private Integer id_cohorte;
	
	@Column(nullable=false)//valor not null
	private Integer numeroCohorte;
	
	@Column(nullable=false, length=50)//valor not null
	private String ciudad;
	
//	RELACIONAR LA LLAVE FORANEA
	@OneToMany(mappedBy="cohorte")
	private List<Alumno> alumnos;
	
	@OneToOne(mappedBy="cohorte")
	private Instructor instructor;
	
//	GETTERS AND SETTERS
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Integer getId_cohorte() {
		return id_cohorte;
	}
	public void setId_cohorte(Integer id_cohorte) {
		this.id_cohorte = id_cohorte;
	}
	public Integer getNumeroCohorte() {
		return numeroCohorte;
	}
	public void setNumeroCohorte(Integer numeroCohorte) {
		this.numeroCohorte = numeroCohorte;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
}
