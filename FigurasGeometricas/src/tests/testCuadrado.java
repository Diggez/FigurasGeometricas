package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Figuras.Cuadrado;

class testCuadrado {

	@Test
	void testCalcularArea() {
		// Calculamos el area que nos da el metodo
		Cuadrado c = new Cuadrado(2);
		double areaObtenida = c.calcularArea();
		//Hardcodeamos el area que sabemos que deberia dar
		double areaEsperada=4;
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testCalcularPerimetro() {
		//Calculamos el perimetro que nos da el metodo
		Cuadrado c = new Cuadrado(2);
		double perimetroObtenido = c.calcularPerimetro();
		//Hardcodeamso el perimetro que sabemos que deberia dar
		double perimetroEsperado=8;
		assertEquals(perimetroEsperado, perimetroObtenido);
		
	}

}
