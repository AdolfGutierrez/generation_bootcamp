package com.perritos;

public class Perro {
	//dentro de una clase podemos tener metodos 
	
	//atributos o propiedades
	
	String nombre; 
	int edad; 
	String raza;
	String tamanio;
	
	//constructor es un metodo y se usa public y en java se tiene que llamr con el 	mismo nombre de la clase
	
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
