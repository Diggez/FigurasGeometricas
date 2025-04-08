package Figuras;

public class Circulo {

	private double radio;
	
	/**
	 * Crea un circulo con el radio especificado en metros
	 * @param radio
	 */
	
	public Circulo(double radio) {
		
		this.radio=radio;
		
	}
	
	/**
	 * Crea un circulo con un radio de 1 metro
	 */
	
	public Circulo(){
		
		this.radio=1;
		
	}
	
	/**
	 * Calcular el area de un circulo
	 * @return el area de un circulo en metros
	 */
	
	public double calcularArea() {
	return 	Math.PI*(radio*radio);
	}
	
	/**
	 * Calcular el perimetro de un circulo
	 * @return el perimetro de un circulo en metros
	 */
	
	public double calcularPerimetro() {
	return 	2*Math.PI*radio;
	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	public double getRadio() {
	return this.radio;	
	}
	
	public String toString() {
		
	return "Circulo con radio: " + radio;	
	}
	
}
