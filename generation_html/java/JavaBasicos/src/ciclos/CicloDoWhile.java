package ciclos;

import javax.swing.JOptionPane;

public class CicloDoWhile {

	public static void main(String[] args) {
		
		String clave="Mario";
		String comparacion="";
		
		do{
			comparacion = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			if(!clave.equals(comparacion)) {
				System.out.println("Contraseña Incorrecta");
				
			}
		}while(!clave.equals(comparacion));
		System.out.println("Contraseña Correcta");
		

	}

}
