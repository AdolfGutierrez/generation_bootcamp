import java.util.Scanner;


	//CALCULADORA REALIZADA CON METODO SWITCH CASE

public class Calculadora {

	public static void main(String[] args) {
		  Scanner calc = new Scanner(System.in);
		
	    System.out.println("1) Suma");   
		System.out.println("2) Resta");
	    System.out.println("3) Multiplicacion");
	    System.out.println("4) Division\n");
	    
	    System.out.print("Elije una opción: ");
	  
		int op=calc.nextInt();
		
		switch(op){
		case 1:
			
			System.out.println("Escribe dos numeros a sumar\n");
			System.out.print("Primer numero ");
			int num1=calc.nextInt();
			System.out.print("Segundo numero ");
			int num2=calc.nextInt();
			int sum=num1 + num2;
			System.out.println("El resultado de la suma es " + sum);
			break;
			
		case 2:
			
			System.out.println("Escribe dos numeros a restar");
			System.out.print("Primer numero ");
			int num3=calc.nextInt();
			System.out.print("Segundo numero ");
			int num4=calc.nextInt();
			int resta=num3 - num4;
			System.out.println("El resultado de la resta es " + resta);
			break;
			
		case 3:
			
			System.out.println("Escribe dos numeros a multiplicar");
			System.out.print("Primer numero ");
			int num5=calc.nextInt();
			System.out.print("Segundo numero ");
			int num6=calc.nextInt();
			int multiplicacion=num5 * num6;
			System.out.println("El resultado de la multiplicacion es " + multiplicacion);
			break;
			
		case 4:
			
			System.out.println("Escribe dos numeros a dividir");
			System.out.print("Primer numero ");
			int num7=calc.nextInt();
			System.out.print("Segundo numero ");
			int num8=calc.nextInt();
			if(num8==0) {
				System.out.println("El numero no es divisible entre 0");
			}else {
				double division= (float)num7/(float)num8;
				System.out.print("El resultado de la divicion es " + division);
			}
			
			break;
			
		
			
		}
		
	}
}
