import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Crear una aplicaci�n que reciba un int entre 1 y 10 y que regrese un mensaje seg�n la calificaci�n ingresada.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		int n1=sc.nextInt();
		
		
		if (n1 <= 3) {
			System.out.println("Failed!");
		}else if(n1 <= 5){
			System.out.println("Insufficient!");
		}else if(n1<=9) {
			System.out.println("Good!");
		}else if(n1==10){
			System.out.println("Excellent!");
		}else if
		(n1>10){
			System.out.println("Grade outside range supported");
		}

		
		
		
		
	}

}
