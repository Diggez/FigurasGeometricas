package Figuras;

public class Cuadrado {

	private double lado;
	
	/**
	 * Crea un cuadrado con el lado especificado en metros
	 * 
	 * @param lado
	 */
	
	public Cuadrado(double lado) {
		
		this.lado=lado;
		
	}
	
	/**
	 * Crea un cuadrado con un lado de un metro
	 */
	
	public Cuadrado() {
		
		this.lado=1;
		
	}
	/**
	 * Calcula el area del cuadrado
	 * 
	 * @return el area del cuadrado en metros cuadrados
	 */
	public double calcularArea() {
	return this.lado*this.lado;	
	}
	/**
	 * Calcula el perimetro del cuadrado
	 * 
	 * @return el perimetro del cuadrado en metros
	 */
	public double calcularPerimetro() {
		return this.lado*4;
	}
	
	public void setLado(double lado) {
		this.lado=lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public String toString() {
		
	return "Cuadrado de lado: " + this.lado;	
	}
	
}
