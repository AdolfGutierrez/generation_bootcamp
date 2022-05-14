	import java.util.Scanner;

	
	//CALCULADORA REALIZADA CON METODO DO WHILE
	
	public class Calculadora2 {

		public static void main(String[] args) {
			System.out.println("Calculadora");
			int opcion;
			do {
				
				System.out.println("1. Suma");
				System.out.println("2. Resta");
				System.out.println("3. Multiplicacion");
				System.out.println("4. Division");
				System.out.println("5. Salir");
				System.out.print("Seleccione una opcion: ");
				Scanner scanner = new Scanner(System.in);
				
				opcion= scanner.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Escribe dos numeros a sumar");
					System.out.print("Ingrese el primer numero: ");
					double numero1 = scanner.nextDouble();
					System.out.print("Ingrese el segundo numero: ");
					double numero2 = scanner.nextDouble();
					System.out.println("El resultado de la suma es: " + (numero1 + numero2));
					break;
				case 2:
					System.out.println("Escribe dos numeros a restar");
					System.out.print("Ingrese el primer numero: ");
					double numero3 = scanner.nextDouble();
					System.out.print("Ingrese el segundo numero: ");
					double numero4 = scanner.nextDouble();
					System.out.println("El resultado de la resta es: " + (numero3 - numero4));
					break;
				case 3:
					System.out.println("Escribe dos numeros a multiplicar");
					System.out.print("Ingrese el primer numero: ");
					double numero5 = scanner.nextDouble();
					System.out.print("Ingrese el segundo numero: ");
					double numero6 = scanner.nextDouble();
					System.out.println("El resultado de la multiplicacion es : " + (numero5 * numero6));
					break;
				case 4:
					System.out.println("Escribe dos numeros a dividir");
					System.out.print("Ingrese el primer numero: ");
					double numero7 = scanner.nextDouble();
					System.out.print("Ingrese el segundo numero: ");
					double numero8 = scanner.nextDouble();
					if (numero8 == 0) {
						System.out.println("El numero no es divisible entre  0");
					} else {
						System.out.println("El resultado de la division es: " + (numero7 / numero8));
					}
					break;
				default:
					System.out.println("Opcion no valida, intenta de nuevo");
					break;
				}

			}
			while (opcion != 5);
		}
	}