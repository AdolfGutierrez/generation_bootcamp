package com.calculadora;

public class PruebaCalculadora {

	public static void main(String[] args) {
		System.out.println("Calcular\n");
		
		Calculadora calc=new Calculadora();
		String mensaje=calc.mensaje();
		System.out.println(mensaje);
		
		int prueba=calc.prueba();
		System.out.println(prueba);
		
		
		double sumar=calc.sumar(20, 1.5);
		System.out.println(sumar);
		System.out.println("\n");
		
		calc.sumarMensaje();
		calc.sumarM(5, 5);
		
		calc.restar(10, 5);
		
		double div=calc.dividir(20, 5);
		System.out.println("El resultado de la divicion es: "+div);
		System.out.println("---------------------");
		
		//OBJETO AREAS 
		
		Areas area=new Areas();
		area.mensaje();
		
		area.cuadrado();
		int cuadrado=area.areaCuadrado(5);
		System.out.println("El area del cuadrado es: "+cuadrado);
		System.out.println("\n");
		
		area.triangulo();
		int triangulo=area.areaTriangulo(2, 5);
		System.out.println("El area del triangulo es: "+triangulo);
		
		
		
		
		
	}

}
