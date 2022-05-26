package com.ejercicio;

public class CalculadoraGeometrica {

	public static void main(String[] args) {
		
//		OBJETO p CREADO DE LA CLASE PERIMETROS
		
		Perimetro p=new Perimetro();
		
		String ms=p.mensaje();
		System.out.println(ms);
		System.out.println("----------");
		
		double Pcuadrado=p.pCuadrado(5);
		System.out.println("El perimetro del cuadraro es: "+Pcuadrado);
		
		double Ptriangulo=p.pTriangulo(5, 4, 2);
		System.out.println("El perimetro del triangulo es: "+Ptriangulo);
		
		double Pcirculo=p.pCirculo(3);
		System.out.println("El perimetro del circulo es: "+Pcirculo);
		System.out.println("\n");
		
//		OBJETO a DE LA CLASE AREAS
		
		Areas a=new Areas();//OBJETO creado de la CLASE Areas
		
		String ms2=a.mensaje2();
		System.out.println(ms2);
		System.out.println("----------");
		
		double Acuadrado=a.aCuadrado(5);
		System.out.println("El area del cuadraro es: "+Acuadrado);
		
		double Atriangulo=a.aTriangulo(5, 4);
		System.out.println("El area del trinagulo es: "+Atriangulo);
		
		double Acirculo=a.aCirculo(5);
		System.out.println("El area del circulo es: "+Acirculo);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
