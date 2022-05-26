package com.calculadora;

public class PruebaCalculadora {

	public static void main(String[] args) {
		System.out.println("Calcular");
		
		//INSTANCIAMIENTO = crear un objeto a partir de una clase
		
		//metodo que no regresa un valor
		
		Calculadora calc= new Calculadora();//calc es el objeto que se está creando a partir de la clase Calculadora
		
		//metodo que regresa un valor
		String mensaje=calc.mensaje();//se crea una variable que contentendra el objeto calc con el metodo de la clase creada 
		System.out.println(mensaje);
		System.out.println("----------");
		
		int prueba=calc.prueba();
		System.out.println(prueba);
		System.out.println("----------");
		
		//metodos con parametros
		double suma= calc.sumar(5, 20);//se crea una variable y se guarda el objeto calc con la llamada al metodo sumar de la clase Calculadora
		System.out.println(suma);
		System.out.println("----------");
		
		calc.sumarMensaje();
		calc.sumarM(8, 5);
		
		System.out.println("----------");
		
		double restar=calc.restar(8,1);
		System.out.println(restar);
		System.out.println("----------");
		
		double multiplicacion=calc.multiplicar(5, 2);
		System.out.println(multiplicacion);
		System.out.println("----------");
		
		double division=calc.dividir(100, 2);
		System.out.println(division);
		System.out.println("----------");
		
		//instanciando areas
		Areas area = new Areas();//OBJETO area de la CLASE Areas
		

		area.mensaje();//llamada de un metodo que retorna un vacio con mensaje
		System.out.println("\n");
		
		area.cuadrado();
		
		int cuadrado=area.areaCuadrado(5);
		System.out.println("El area del cuadrado es :" +cuadrado);
		System.out.println("----------");
		
		area.triangulo();
		
		int triangulo=area.areaTriangulo(5, 4);
		System.out.println("El area del triangulo es "+triangulo);
		System.out.println("----------");
		
		
	}

}
