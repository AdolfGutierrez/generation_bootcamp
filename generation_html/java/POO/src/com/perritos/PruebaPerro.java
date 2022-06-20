package com.perritos;

public class PruebaPerro {

	public static void main(String[] args) {
		//Instancias = crear un objeto
		
		Perro perro1 = new Perro("Moly", 4);
		
		//cabiar sus atributos
		perro1.raza="PitBull";
		perro1.tamanio="XL";
		
		perro1.ladrar();
		int edadP = perro1.edadPerruna();
		System.out.println("El perro Moly tiene " + (edadP) + " años de edad");
		
		
		Perro perro2=new Perro("Miller", 3);
		
		//llamada del metodo estatico
	
		Perro.mensaje();
		
		//cabiar sus atributos
		perro2.raza="RothWiler";
		perro2.tamanio="Grande";
		
		perro2.ladrar();
		int edadPe=perro2.edadPerruna();
		System.out.println("El perro Myller tiene " + (edadP) + " años de edad");
		

	}

}
