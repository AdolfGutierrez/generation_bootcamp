package com.calculadora;

public class PruebaCalculadora {

	public static void main(String[] args) {
		System.out.println("Calcular");
		
		//INSTANCIAMIENTO = crear un objeto a partir de una clase
		
		//calc es el objeto que se está creando 
		//metodo que no regresa un valor
		Calculadora calc= new Calculadora();
		
		//metodo que regresa un valor
		String mensaje=calc.mensaje();
		System.out.println(mensaje);
		
		double prueba=calc.prueba();
		System.out.println(prueba);
		
		//metodos con parametros
		double suma= calc.sumar(5, 20);
		System.out.println(suma);
		
		calc.sumarM(8, 5);
		
		double restar=calc.restar(8,1);
		System.out.println(restar);
		
		
		//instanciando areas
		Areas area = new Areas();

		area.mensaje();
		
		area.cuadrado();
		int areaC=area.areaCuadrado(5);
		System.out.println(areaC);
		
		area.triangulo();
		int areaT=area.areaTriangulo(5, 4);
		System.out.println(areaT);
		
	}

}
