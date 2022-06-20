package com.generation.test;

import com.generation.model.Perro;

public class PruebaPerro {

	public static void main(String[] args) {
		
		Perro denzel=new Perro("Denzel","PitBull","XL", 3, "Negro");
		System.out.println(denzel);
		
		
		//llamada de los metodos estaticos
		denzel.setHumano("Adolf");
		System.out.println(Perro.buscarHumano(1));
		denzel.comer();
		denzel.dormir();
		denzel.jugar();
		denzel.sentar();
		denzel.correr();
		System.out.println("\n");
		
		Perro moly=new Perro("Moly","BullTerrier","X",2,"Blanco");
		System.out.println(moly);
		
		//llamada de los metodos estaticos
		
		moly.setHumano("Sofia");
		System.out.println(Perro.buscarHumano(2));
		moly.comer();
		moly.dormir();
		moly.jugar();
		moly.sentar();
		moly.correr();
		System.out.println("\n");
		
		Perro miler=new Perro("Miler","dalmata","grande",2,"azul");
		System.out.println(miler);
		
		miler.setHumano("Mario");
		System.out.println(Perro.buscarHumano(3));
		miler.comer();
		miler.correr();
		miler.dormir();
		miler.jugar();
		miler.sentar();
		
		
		
		
	}

}
