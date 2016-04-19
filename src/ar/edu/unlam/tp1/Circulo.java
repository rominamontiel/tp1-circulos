package ar.edu.unlam.tp1;

public class Circulo {
	private Double radio;
	
	public Circulo(double radio){
		this.radio=radio;
	}
	
	public double obtenerRadio(){ 
		return radio; }
	
		
	public double calcularArea(){
		return radio*radio*Math.PI;
	}
	
	public double calcularPerimetro(){
		return radio*2*Math.PI;
	}

}
