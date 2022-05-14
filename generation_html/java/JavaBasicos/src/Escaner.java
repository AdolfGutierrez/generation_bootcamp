import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		
		Scanner escaner=new Scanner(System.in);
		System.out.print("Ingresa un numero:");
		int numero=escaner.nextInt();
		System.out.println("El numero ingresado es:" + numero);
		
		System.out.print("Escribe una palabra:");
		String palabra=escaner.next();
		System.out.println("La palabra ingresada es:" + palabra);
		
		if(numero<10) {
			System.out.println("El numero es menor a 10");
		}
		
     	
		
	}

}
