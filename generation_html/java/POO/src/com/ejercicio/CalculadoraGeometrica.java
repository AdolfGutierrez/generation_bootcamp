package com.ejercicio;

public class CalculadoraGeometrica {

	public static void main(String[] args) {
		
		
		Perimetro p= new Perimetro();
		
		String mensaje=p.mensaje();
		System.out.println(mensaje);
		
		double pCuadrado=p.pCuadrado(5);
		System.out.println("El perimetro del cuadrado es "  + (pCuadrado));
		
		
		double pTriangulo=p.pTriangulo(2, 5, 3);
		System.out.println("El perimetro del triangulo es "  + (pTriangulo));
		
		double pCirculo=p.pCirculo(2);
		System.out.println("El perimetro del circulo es "  + (pCirculo));
		
		
		Areas a= new Areas();
		
		String mensaje2=a.mensaje2();
		System.out.println(mensaje2);
	
		
		double aCuadrado=a.aCuadrado(2);
		System.out.println("El area del circulo es "  + (aCuadrado));
		
		double aTriangulo=a.aTriangulo(2, 5);
		System.out.println("El area del triangulo es: "+ (aTriangulo ));
		
		
		double aCirculo=a.aCirculo(5);
		System.out.println("El area del circulo es "  + (aCirculo));
		
		
		
	}

}
