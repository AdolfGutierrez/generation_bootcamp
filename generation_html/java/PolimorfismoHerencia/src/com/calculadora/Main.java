package com.calculadora;

public class Main {

	public static void main(String[] args) {
		
//		instanciar
		Calculadora cal=new Calculadora(5,8);
		cal.sumar(5,8);
		
		Calculadora cal2=new Calculadora(2,3,4);
		cal.sumar(1, 2, 3);
		
		Calculadora cal3=new Calculadora(1,2,3,4);
		cal.sumar(2, 2, 2, 2);

	}

}
