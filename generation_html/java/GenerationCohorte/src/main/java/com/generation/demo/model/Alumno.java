package com.generation.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


//			TABLA ALUMNO


@Entity
@Table(name="alumnos")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_alumno;
	
	@Column(nullable=false)
	private String nombre_alumno;
	
	@Column(nullable=false)
	private Integer edad;
	
	@Column(nullable=false, unique=true)
	private String correo;
	
//	LLAVE FORANEA- estamos relacionando al alumno con la cohorte
//	se le pone el nombre de la tabla que sera foranea
//	se especifica el tipo de relacion (de la clase alumno a la clase cohorte)
	
	@ManyToOne //se usa eta anotación-relacion "muchos"
	@JoinColumn(nullable=false, name="cohorte_id")//
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private Cohorte cohorte;
	
	
//	GETTERS AND SETTERS
	public Integer getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(Integer id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre_alumno() {
		return nombre_alumno;
	}

	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Cohorte getCohorte() {
		return cohorte;
	}

	public void setCohorte(Cohorte cohorte) {
		this.cohorte = cohorte;
	}

	
}
