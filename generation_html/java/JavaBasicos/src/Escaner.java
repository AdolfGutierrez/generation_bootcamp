import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		
		//Scanner nos ayuda a ingresar datos desde el teclado
		Scanner escaner=new Scanner(System.in);
		System.out.print("Ingresa un numero: ");
		
		int numero=escaner.nextInt();
		System.out.println("El numero ingresado es: " + numero);
		
		if(numero<10) {
			System.out.println("El numero ingresado es menor a 10");
		}else {
			System.out.println("El numero ingresado es mayor a 10");
		}
				
		System.out.print("\nEscribe una palabra: ");
		
		String palabra=escaner.next();
		System.out.println("La palabra ingresada es: " + palabra);
		
	}

}
