package com.calculadora;

public class Calculadora {
//	atributos
	
	private int a;
	private int b;
	private int c;
	private int d;
	private int resultado; 
	
//	constructor
	public Calculadora(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public Calculadora(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public Calculadora(int a, int b, int c, int d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
//	metodo
	public void sumar(int a, int b) {
		resultado = a+b;
		System.out.println("El resultado de la suma es: "+resultado);
	
	}
	public void sumar(int a, int b, int c) {
		resultado = a+b+c;
		System.out.println("El resultado de la suma es: "+resultado);
	}
	public void sumar(int a, int b, int c, int d) {
		resultado = a+b+c+d;
		System.out.println("El resultado de la suma es: "+resultado);
	
	}
	

//	geters y seters
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
}
