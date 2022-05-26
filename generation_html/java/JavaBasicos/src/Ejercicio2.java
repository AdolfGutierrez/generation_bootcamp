import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// Escribe una aplicación que calcule el indice de masa corporal.
		
		Scanner teclado=new Scanner(System.in);
		
        //DECLARACION DE VARIABLES.
        double p,e,imc;
        
        //ENTRADAS DE VALORES
        System.out.print("Sofia, cual es su peso en Kg: ");
        p= teclado.nextDouble();
        System.out.print("Y cual es tu estatura en metros (m):");
        e= teclado.nextDouble();
        
        //CALCULO
        imc= p/(e*e);
        System.out.print("Su Indice de Masa Corporal es: " + imc);
        
        //IMC POR PERSONA
        if (imc<18.5) {
            System.out.print(" BAJO PESO");
        } else if ( imc<=24.9) {
            System.out.print(  " NORMAL");
        } else if ( imc<=29.9) {
            System.out.print(  " SOBREPESO");
        } else {
            System.out.print(" OBESIDAD");
        }
    }
 

	}


