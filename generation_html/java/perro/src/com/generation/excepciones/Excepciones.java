package com.generation.excepciones;

public class Excepciones {

	public static void main(String[] args) {
		int num1=10;
		Integer num2=null;
		
		float division;
		
		
		//try-catch-finally
		try {
			//codigo que vamos a probar
			division=num1/num2;
		}catch(ArithmeticException ex){//en los (la excepcion a observar)
			//lo que se realia al detectar una excepcion
			division=0.0f;
			System.out.println("Error: "+ex.getMessage());
			
		}catch(NullPointerException ex){
			division=0.0f;
			System.out.println("Error en la division "+ex.getMessage());
		}
		finally {
			System.out.println("Finalizo el try catch");
		}
		System.out.println(division);
	}

}
