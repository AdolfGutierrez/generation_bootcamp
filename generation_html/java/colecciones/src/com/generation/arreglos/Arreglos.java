package com.generation.arreglos;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		//arreglos - matrices - arrays
		
		int [] arrNumeros=new int[5];//estructura de un arreglo de objetos
		//int [] + nombreArreeglo = new int [cantidad de objetos en el arreglo];
		
		arrNumeros[0]=3;
		arrNumeros[1]=Integer.parseInt("1");
		arrNumeros[2]=5;
		arrNumeros[3]=6;
		arrNumeros[4]=9;	
		//Se llaman los elementos del arreglo en forma de arreglo
		System.out.println(("Llamada del arreglo ") + Arrays.toString(arrNumeros));
		System.out.println("\n");
		
		
		
		
		//se puede llamar cada uno de los elementos por separado
		
//		System.out.println("El elemento = " + arrNumeros[0]);
//		System.out.println("El elemento = " + arrNumeros[3]);
//		System.out.println("El elemento = " + arrNumeros[4]);
		
		
		
		
		
		//se mandan llamar los elementos del arreglo en forma de lista		
		for(int i=0;  i<arrNumeros.length; i++) {
			System.out.println(arrNumeros[i]);
		}
		System.out.println("\n");
		
		
		
		
		
		//forEach nos ayuda a seleccionar el lugar de donde se tomaran los elementos del arreglo
		int conteo=0;
		for(int elemento:arrNumeros) {
			conteo++;
			System.out.println("El elemento= " + (elemento));
		}
		System.out.println("\n");
		
		
		
		
		
		
	//ARREGLO QUE GUARDA OBJETOS 
		
		Persona persona1= new Persona("Mario", 28);
		Persona persona2= new Persona("Adolfo",27);
		
//		Object arrPersonas[]=new Object[3];
		Persona [] arrPersonas=new Persona[1];
		
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
