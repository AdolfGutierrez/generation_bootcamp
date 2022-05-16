package ciclos;

public class CicloFor {

	public static void main(String[] args) {
		//Ciclo FOR
		
		//imprime hola 5 veces de menor a mayor
//		for(int i=0; i<5; i++) {
//			System.out.println("Hola " + i);
//		}
//		//imprime hola 5 vences de mayor a menor
//		for (int i=5; i>0; i--) {
//			System.out.println("Holax2 "+ i);
//		}
//		
//		for(int i=0; i<20; i+=2) {
//			
//			System.out.println("Holax3 "+ i);
//		}
//		
		//continue && break
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {
//				continue;
				break;
				
			}
			System.out.println(i);
		}

	}

}
