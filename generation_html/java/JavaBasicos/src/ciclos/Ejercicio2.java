package ciclos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Validaci�n de correo

		//Escribe un programa que reciba un correo y  que, usando un ciclo for, eval�e si el correo contiene un 			caracter de '@'.
		//Si lo tiene, el programa debe mostrar en consola:
		//"Es un correo v�lido"
		
		//Si no lo tiene, el programa debe mostrar:
		//"No es un correo v�lido"
		
		String correo = "";
        boolean esValido = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un correo");
        correo = sc.nextLine();
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i) == '@') {
                esValido = true;
                System.out.println("Es un correo v�lido");
            }
            else {
                esValido = false;
                continue;
            }
            System.out.println("Hola ya termine");
        }

}
}

	
