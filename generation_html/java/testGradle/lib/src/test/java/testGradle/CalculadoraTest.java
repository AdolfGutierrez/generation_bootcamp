package testGradle;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

	@Test
	public void sumaTest() {
		Calculadora sumaCalc=new Calculadora();
		Assertions.assertEquals(2,sumaCalc.suma(1, 1));
	}
	@Test
	public void assertTest() {
		boolean valorBoolean=true;
		assertTrue(valorBoolean);
		
	}
	
	@Test
	@DisplayName("Metodo para comprobar assertions")
	public void suma1Test() {
		Calculadora sumaCalc=new Calculadora();
		Assertions.assertEquals(4,sumaCalc.suma1(1,3),"El resultado de la suma debe ser:4");
	}
	
	@Test
	public void multiplicacionTest() {
		Calculadora multiCalc=new Calculadora();
		Assertions.assertEquals(10, multiCalc.multiplicacion(2, 5));
		
		assertAll(
				"Encabezado",
				()-> assertEquals(2,1+1),
				()-> assertTrue(true)
				);
	}
}
