import java.util.Objects;

public class OperadoresLogicos {

	public static void main(String[] args) {
		//operadores de asignacion
		
		int num=12;
		num=45;
		num=Integer.parseInt("6");
		
		System.out.println(num);

		//Operadores de comparacion
		
		int num1, num2;
		num1=10;
		num2=20;
		
		//se concatenan los strings con el valor numerico 
		//System.out.println("num1: " + num1);
		//System.out.println("num2: " + num2);
		//operador de comparacion
		//System.out.println(num1==num2);
		
		//.equals()

		//System.out.println(Objects.equals(num1, num2));
		

		// <,>,<=,>=
		int num3,num4;
		num3=15;
		num4=20;
		
//		System.out.println(num3>num4);
//		System.out.println(num3<num4);
//		System.out.println(num3>=num4);
//		System.out.println(num3<=num4);
		
		if(num3>num4) {
			//codigo a ejecutar
//			System.out.println("Numero 4 es mayor");
		}
		else {
//			System.out.println("Numero 3 es menor a 4");
		}
		
		// x != y x es diferente de y?
//		System.out.println(num3!=num4);
		
		boolean comparacion=num3!=num4;
//		System.out.println(comparacion);
		
		//operadores logico o condicionales
		
		//para que se ejecute la fucnion de las siguientes condiciones: 
		
		//AND=&& (LAS DOS CONCIDIONES SEAN VERDADERAS)
		//OR=|| (SI UNA DE LAS DOS CONDICIONES ES VERDADERA)
		//NOT=! (NIEGA LA PRIMERA EVALUACION) 
		
		System.out.println(true&&true);
		
		System.out.println(true||false);
		
		System.out.println(!true&&true);
		
		System.out.println(!(false&&true));
		
		System.out.println(true||!true);
	}

}
