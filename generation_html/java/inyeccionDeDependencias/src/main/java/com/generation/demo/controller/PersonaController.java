package com.generation.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.demo.service.PersonaServiceImpl;

@RestController
@RequestMapping("/api")//sirve para indicarle a la URL la ruta que debe tomar
public class PersonaController {
	
	private PersonaServiceImpl personaServiceImpl;
	
	@Autowired
	public PersonaController(PersonaServiceImpl personaServiceImpl) {
		this.personaServiceImpl=personaServiceImpl;
	}
	
	@GetMapping("/saludo")// http://localhost:8080/api/saludo
	public String saludo() {
		return "Hola";
	}
	
	@GetMapping("/registro")//http://localhost:8080/api/registro
	public String registro (@RequestParam(value="nombre",defaultValue="Desconocido")String nombre) {
//		personaServiceImpl = new PersonaServiceImpl();
		return personaServiceImpl.registro(nombre);
	}
	@GetMapping("/calcular")//http://localhost:8080/api/calcular?num1=5&num2=5
	public int calcular(@RequestParam(value="num1", defaultValue="0")int a, @RequestParam(value ="num2", defaultValue="0")int b) {
		return personaServiceImpl.calcular(a,b); 
	}

}
