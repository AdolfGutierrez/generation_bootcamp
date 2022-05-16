package com.ejercicio;

public class Areas {
	
	public String mensaje2() {
		String mensaje="Areas";
		return mensaje;
	}
	/////
	
	public void cuadrado() {
		System.out.println("Calcular el area de un Cuadrado");
	}
	public double aCuadrado(double l) {
		
		return l*4;
	}
	/////
	
	public void triangulo() {
		System.out.println("Calcular el area de un Triangulo");
	}
	public double aTriangulo(double b, double a) {
		return(b*a)/2;
	}
	/////
	
	public void circulo() {
		System.out.println("Calcular el area de un Circulo");
	}
	public double aCirculo(double r) {
		return Math.PI*(r*r);
	}
	

}
