package com.calculadora;

public class Calculadora {//Se crea una clase llamada Calculadora
	
	
//	METODOS(instrucciones) de la CLASE Calculadora
	
	public void sumarMensaje() {//cuando el metodo contiene un void no retorna ningun valor o podemos mandar llamarlo con el objeto.metodo
		System.out.println("Voy a sumar dos numeros");	
	}
	
	//Metodo que si retorna datos
	public String mensaje() {
		String mensaje="Voy a realizar una operacion";
		return mensaje; 
	}
	
	
	public int prueba() {
		return 2;
	}
	
	
	//Operaciones
	public double sumar(double a, double b) {//cuando retorne un valor se crea una variable y se almacena el objeto con el metodo 
		return a+b;
	}
	
	
	public void sumarM(int a, int b) {
		System.out.println("El resultado de la suma es: " + (a+b));
	}
	
	
	public double restar(double a, double b) {
		return a-b;
	}
	
	
	public double multiplicar(double a, double b) {
		return a*b;
	}
	
	
	public double dividir(double a, double b) {
		if(b!=0) {
			return a/b;
		}
		else {
			return-1;
		}
		
	}
	
}
