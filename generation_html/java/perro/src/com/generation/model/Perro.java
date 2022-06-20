package com.generation.model;

import java.util.HashMap;
import java.util.Map;

public class Perro {
	
	//Atributos de la clase perro
	private String nombre; 
	private String raza;
	private String tamanio; 
	private int edad; 
	private String color; 
	private int id; 
	private static int contador=0;
	private static Map<Integer, String>humano=new
	HashMap<Integer, String>();		
	
	//constructor de la clase perro 
	public Perro(String nombre,String raza, 
			String tamanio,int edad,String color) 
	{	
		this.nombre=nombre; 
		this.raza=raza;
		this.tamanio=tamanio;
		this.edad=edad;
		this.color=color;
		this.id=++Perro.contador;
	}
	
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Perro.contador = contador;
	}
	
	public void setHumano(String value) {
		Perro.humano.put(this.id, value);
	}
	
	
	
	//Métodos de la clase perro
	public static String buscarHumano(Integer key) {
		return "El nombre de este humano es: " + humano.get(key);
	}
	public void comer() {
		System.out.println(nombre + " está comiendo ");
	}
	public void dormir() {
		System.out.println(nombre + " está durmiendo ");
	}
	public void jugar() {
		System.out.println(nombre + " está jugando");
	}
	public void sentar() {
		System.out.println(nombre + " está sentado ");
	}
	public void correr() {
		System.out.println(nombre + " está corriendo ");
	}
	


	//	metodo toStrings
	//	agrega una descripcion de los valores de la clase 
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamanio + ", edad=" + edad + ", color="
				+ color + ", id=" + id + "]";
	}
	
	}


