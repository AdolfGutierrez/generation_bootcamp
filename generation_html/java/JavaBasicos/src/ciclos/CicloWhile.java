package ciclos;

import javax.swing.JOptionPane;

public class CicloWhile {

	public static void main(String[] args) {
		// CICLO WHILE; significa "mintras que"
		
//		int condicion=0;
//		
//		while(condicion<5) {
//			System.out.println("Hola");
//			condicion++;
//			
//		}
		
		//aplicacion para verificar contraseņa
		
		//se introducen dos variables donde se almacena la contraseņa y la comparacion
		String clave="Mario";
		String comparacion="";
		
		//el ciclo while indica que si la clave es diferente de la comparacion no se 		ejecutara hasta que sea verdadera la condicion.
		while(!clave.equals(comparacion)) {
			comparacion = JOptionPane.showInputDialog("Introduce la contraseņa, por favor");
			
		//if nos condiciona que si la clave es correcta se ejecuta la primera sentencia sino es asi se ejecuta la segunda condicion	
			if(!clave.equals(comparacion)) {
				System.out.println("Contraseņa Incorrecta");
				
			}
		}
		
		System.out.println("Contraseņa Correcta");
			
		}

	}
