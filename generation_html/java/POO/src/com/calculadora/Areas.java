package com.calculadora;

import java.util.Scanner;

public class Areas {
	
	
	
	public void mensaje() {
		System.out.println("Calcular una Area");
	}
	//
	
	public void cuadrado() {
		System.out.println("Calculando el area de un cuadrado");
	}
	public int areaCuadrado(int l) {
		
		return l*l;
	}
	//
	
	public void triangulo() {
		System.out.println("Calculando el area de un triangulo");
	}
	
	public int areaTriangulo(int base, int altura) {
		return(base*altura)/2;
	}

}
