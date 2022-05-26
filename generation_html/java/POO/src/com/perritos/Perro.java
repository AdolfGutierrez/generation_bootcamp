package com.perritos;

public class Perro {
	//atributos o propiedades de la clase Perro
	
	String nombre; 
	int edad; 
	String raza;
	String tamanio;
	
//	constructor es un metodo  y se tiene que nombrar con el mismo nombre de la clase
//	this es un operador que nos permite llamar los atributos de una clase
	public Perro(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
		
	}
	
	
	//Metodos 
	public void ladrar() {
		System.out.println("El perro "+ nombre  + " hace Guauf ");
	}
	
	public int edadPerruna() {
		return edad*7;
		
	}
	
	//Metodos estaticos= nos permite utilizarlo sin instanciar un objeto
	public static void mensaje() {
		System.out.println("Esta es una clase Perro");
	}

}
