package com.generation.arreglos;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		//arreglos - matrices - arrays
		
		int [] arrNumeros=new int[5];
		
		arrNumeros[0]=3;
		arrNumeros[1]=Integer.parseInt("1");
		arrNumeros[2]=5;
		arrNumeros[3]=6;
		arrNumeros[4]=9;
		System.out.println(Arrays.toString(arrNumeros));
		System.out.println("El elemento = " + arrNumeros[0]);
		System.out.println("El elemento = " + arrNumeros[3]);
		System.out.println("El elemento = " + arrNumeros[4]);
		
		//Se utiliza un ciclo para guardar un arreglo de datos 
		
		for(int i=0;  i<arrNumeros.length; i++) {
			System.out.println(arrNumeros[i]);
		}
		
		//forEach nos ayuda a seleccionar el lugar de donde se tomaran los elementos del arreglo
		int conteo=0;
		for(int elemento:arrNumeros) {
			conteo++;
			System.out.println("El elemento = " + (elemento));
		}
		
	//ARREGLO QUE GUARDA OBJETOS 
		
		Persona persona1= new Persona("Mario", 28);
		Persona persona2= new Persona("Adolfo",27);
		
//		Object arrPersonas[]=new Object[3];
		Persona arrPersonas[]=new Persona[3];
		
		arrPersonas[0]=persona1;
		arrPersonas[1]=persona2;
		arrPersonas[2]=new Persona("Sofia", 27);
//		System.out.println(Arrays.toString(arrPersonas));
		
		for(Persona elemento:arrPersonas) {
			System.out.println(elemento.nombre +" "+ elemento.edad);
		}
		
		
		//Arreglos literales
		String []arrString= {"hola","mi","nombre","es","Mario"};
		System.out.println(arrString.length);
	}

}
