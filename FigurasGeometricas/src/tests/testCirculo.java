package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Figuras.Circulo;
import Figuras.Cuadrado;

class testCirculo {

	@Test
	void testCalcularArea() {
		// Calculamos el area que nos da el metodo
				Circulo c = new Circulo(2);
				double areaObtenida = c.calcularArea();
				//Hardcodeamos el area que sabemos que deberia dar
				double areaEsperada=12.566370614359172;
				assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testCalcularPerimetro() {
		//Calculamos el perimetro que nos da el metodo
				Circulo c = new Circulo(2);
				double perimetroObtenido = c.calcularPerimetro();
				//Hardcodeamso el perimetro que sabemos que deberia dar
				double perimetroEsperado=12.566370614359172;
				assertEquals(perimetroEsperado, perimetroObtenido);
	}

}
