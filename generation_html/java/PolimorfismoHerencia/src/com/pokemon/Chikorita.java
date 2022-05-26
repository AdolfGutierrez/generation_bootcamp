package com.pokemon;

public class Chikorita extends TipoPlanta {
//	atributos especificos 
	private int numeroCuernitos;
	
	public Chikorita(int id, int edad, 
			int nivel, String nombre, 
			boolean evolucion, int numeroHojas,
			int numeroCuernitos) 
  {	
		super(id,edad,nivel,nombre,evolucion,numeroHojas);
		this.numeroCuernitos=numeroCuernitos;
  }
	
	
//	metodo especifico 
	public void latigo() {
		System.out.println(getNombre()+" uso latigo");
	}
	public void atacar() {
		System.out.println(getNombre()+" tipo planta esta atacando x2");
	}
	
//	geter y seter 
	public int getNumeroCuernitos() {
		return numeroCuernitos;
	}
	
	public void setNumeroCuernitos(int numeroCuernitos) {
		this.numeroCuernitos = numeroCuernitos;
	}


	@Override
	public String toString() {
		return "Chikorita [numeroCuernitos=" + numeroCuernitos + "]";
	}
	
	
	
	
}
