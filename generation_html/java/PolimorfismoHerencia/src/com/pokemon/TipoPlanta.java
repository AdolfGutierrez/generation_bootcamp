package com.pokemon;

public class TipoPlanta extends Pokemon {
//	atributos de pokemon planta
	private int numeroHojas;

//	constructor: SUPER llama al construtor de la clase Pokemon
	public TipoPlanta(int id, int edad,
			int nivel, String nombre,
			boolean evolucion, int numeroHojas) 
		
	{
		super(id,edad,nivel,nombre,evolucion);
		this.numeroHojas=numeroHojas;
	}
	
//	metodos
	public void paralizar() {
		System.out.println(getNombre()+" esta paralizando");
	}
	public void envenenar() {
		System.out.println(getNombre()+" esta envenenando");
	}
	public void atacar() {
		System.out.println(getNombre()+" tipo planta esta atacando");
	}

	
	
//	geter y seter ENCAPSULAMIENTO
	
	public int getNumeroHojas() {
		return numeroHojas;
	}

	public void setNumeroHojas(int numeroHojas) {
		this.numeroHojas = numeroHojas;
	}

	@Override
	public void saludar(String mensaje) {
		System.out.println(mensaje);
		
		
	}
}
