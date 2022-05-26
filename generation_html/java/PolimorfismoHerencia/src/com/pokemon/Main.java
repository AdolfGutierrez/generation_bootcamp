package com.pokemon;

public class Main {

	public static void main(String[] args) {
//		 OBJETO chikorita de la clase POKEMON
//		Pokemon chikorita=new Pokemon(152,1,20,"chikorita",false);

//		metodos de instanciamiento
//		chikorita.comer();
//		chikorita.atacar();
//		chikorita.dormir();
		System.out.println("----------");
		
//		 OBJETO2 chikorita2 de la clase POKEMON
		TipoPlanta chikorita2=new TipoPlanta(152,1,20,"chikorita2",false, 10);
		chikorita2.comer();
		chikorita2.atacar();
		chikorita2.dormir();
		chikorita2.envenenar();
		chikorita2.paralizar();
		System.out.println("----------");
		
//	OBJETO3 Pokemon Chikorita de la clase Chikorita
		Chikorita chikorita3=new Chikorita(152,1,20,"chikorita3",false, 10,2);
		chikorita3.comer();
		chikorita3.atacar();
		chikorita3.dormir();
		chikorita3.envenenar();
		chikorita3.paralizar();
		chikorita3.latigo();
		System.out.println("----------");
		
		Charmander charmander=new Charmander(152,1,20,"Charmander",false);
		charmander.comer();
		charmander.atacar();
		charmander.dormir();
		charmander.araniar();
		charmander.volar();
		charmander.lanzaLlamas();
		
		charmander.saludar("Hola");
		
		
		
		
		
		

	}

}
