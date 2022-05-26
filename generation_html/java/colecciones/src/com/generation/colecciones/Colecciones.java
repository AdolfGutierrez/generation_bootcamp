package com.generation.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		
		//List - ArrayList
		System.out.println("\tList --- ArrayList");
		List<String> miArray=new ArrayList<String>();
		
		miArray.add("Mario");
		miArray.add("Sofia");
		miArray.add("Adolfo");
		miArray.add(2,"Celina");
		String elemento=miArray.remove(0);
		
		System.out.println(miArray);
		System.out.println(miArray.size());
		System.out.println(elemento);
		imprimir(miArray);
		
		
		
		/*tipos de datos compuestos
		 * int ==> Integer
		 * boolean ==> Boolean
		 * long==>Long
		 * double==>Double 
		 */
		int num1=10;
		Integer num2=10;
		System.out.println(num1);
		System.out.println(num2);
	
		
		List<Integer>miArray2=new ArrayList<Integer>();
		miArray2.add(3);
		miArray2.add(6);
		miArray2.add(9);
		imprimir(miArray2);
		
		//Ste -- HashSet
		System.out.println("\t Ste --- HashSet");
		Set<String>miSet=new HashSet<String>();
		//no acepta elementos duplicados
		//no los guarda en orden especifico
		//la coleccion que mas funciona rapido 
		
		miSet.add("Jorge");
		miSet.add("Jorge");
		miSet.add("Jorgina");
		miSet.add("Gaby");
		miSet.add("Mikel");
		miSet.add("Yola");
		miSet.remove("Jorge");//para quitar un elemento del sert(arreglo)
		
		System.out.println(miSet);
		imprimir(miSet);
		System.out.println(miSet.contains("Gaby")); //para preguntar si hay un elemento el el set
		
		//Map -- HashMap
		//<Key/llave, value/valor>
		System.out.println("\t Map --- HashMap");
		Map<String,Integer>miMap=new HashMap<String,Integer>();
		miMap.put("Valor 1 " , 50);
		miMap.put("Valor 2 " , 45);
		miMap.put("Valor 2 " , 60);
		miMap.put("Valor 3 " , 70);
		miMap.put("Valor 4 " , 80);
		
		System.out.println(miMap);
		System.out.println(miMap.values());
		System.out.println(miMap.keySet());
		System.out.println(miMap.get("Valor 1 "));
		
		for(String llave: miMap.keySet() ) {
			System.out.println(llave + " " + miMap.get(llave));
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
		public static void imprimir(Collection coleccion) {
			for(Object elemento:coleccion) {
				System.out.println("Elemento = " + elemento);
			}
		}
	
}
