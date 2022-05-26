import java.util.Scanner;

public class FlujoDeControl {

    public static void main(String[] args) {
        
    	//SCANNER nos permite pedir al usuario la entrada de datos desde el teclado
    	Scanner entrada = new Scanner(System.in); 
        System.out.print("¿Cual es tu edad? ");       
        int edad = entrada.nextInt(); //.nextInt nos permite ingresar un numero entero a consola
        
        if (edad >= 18) {
        	if (edad >=50)
            
             {
        		System.out.println("Eres un adulto joven");
                System.out.println("Eres un adulto mayor");
            }
        } else {
            System.out.println("Eres menor de edad");
        }

        String mensaje = (edad >= 18) ? "Eres un adulto joven x2" : "Eres menor de edad x2";
        System.out.println(mensaje);
        
        System.out.print("\n¿en que dia estamos? ");        
		entrada.nextLine(); //.nextLine nos permite ingresar palabras en consola
		String dia=entrada.nextLine();
		entrada.close();
        

        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.print("Inicio de semana, no voy a trabaja");
                break;
            case "martes":
                System.out.print("Ya mero es viernes");
                break;
            case "miercoles":
            	System.out.print("El ombligo de la semana");
            	break;
            case "jueves":
            	System.out.print("Juebebes");
            	break;
            case "viernes":
            	System.out.println("Viernes de pistiar");
            	break;
            	
            	

        }	} }
