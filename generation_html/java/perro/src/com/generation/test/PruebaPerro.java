package com.generation.test;

import com.generation.model.Perro;

public class PruebaPerro {

	public static void main(String[] args) {
		
		Perro denzel=new Perro("Denzel","PitBull","XL", 3, "Negro");
		System.out.println(denzel);
		
		//llamada de los metodos estaticos
		denzel.setHumano("Adolf");
		denzel.comer();
		denzel.dormir();
		denzel.jugar();
		denzel.sentar();
		denzel.correr();
		
		Perro miller=new Perro("Miller","BullTerrier","X",2,"Blanco");
		System.out.println(miller);
		
		//llamada de los metodos estaticos
		miller.setHumano("Sofia");
		miller.comer();
		miller.dormir();
		miller.jugar();
		miller.sentar();
		miller.correr();
		
		System.out.println(Perro.buscarHumano(1));
		System.out.println(Perro.buscarHumano(2));
	}

}
