package Ahorcado;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalabraTest {

	private Palabra palabraOculta;
	
	@Before
	public void setUp() throws Exception {
		palabraOculta = new Palabra();
		palabraOculta.elegirPalabra();
	}
	
	@Test
	public void testComprobarLetraUsada() {
		palabraOculta.comprobarLetra('j');
		palabraOculta.comprobarLetra('e');
		assertTrue(palabraOculta.comprobarLetraUsada('j'));
		assertFalse(palabraOculta.comprobarLetraUsada('h'));

		
	}

}
