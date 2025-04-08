package Figuras;

public class Rectangulo {

	private double base;
	private double altura;
	
	/**
	 * Crea un rectangulo con la base y la altura especificado en metros
	 * @param radio
	 */
	
	public Rectangulo(double base, double altura) {
		
		this.base=base;
		this.altura=altura;
		
	}
	
	/**
	 * Crea un circulo con base de 1 metro y altura de 2 metros
	 */
	
	public Rectangulo() {
		this.base=1;
		this.altura=2;
	}
	
	/**
	 * Calcular el area de un rectangulo
	 * @return el area de un rectangulo en metros
	 */
	
	public double calcularArea() {
	return 	base*altura;
	}
	
	/**
	 * Calcular el rectangulo de un circulo
	 * @return el rectangulo de un circulo en metros
	 */
	
	public double calcularPerimetro() {
	return 	2*base+2*altura;
	}
	
	public void setBase(double base) {
		this.base=base;
	}
	public void setAltura(double altura) {
		this.altura=altura;
	}
	public double getBase() {
	return base;	
	}
	
	public double getAltura() {
	return altura;	
	}
	
	public String toString() {
	return "Rectangulo con base: " + base + " y altura: " + altura;	
	}
	
}
