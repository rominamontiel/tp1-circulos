package ar.edu.unlam.tp1;

public class Circulo {
	private double radio;
	
	//DIGO QUE: RADIO DE ESTA CLASE SEA IGUAL AL RADIO QUE LE ASIGNE CON NEW en el test
	public Circulo(double radio){
		this.radio=radio;
	}
	
		public double obtenerRadio(){ //devuelve el radio que previamente cambie (en test)
		return radio; }
	
	//METODOS-OPERACIONES MATEMATICAS
	
	public double calcularArea(){
		return radio*radio*Math.PI;
	}
	
	public double calcularPerimetro(){
		return radio*2*Math.PI;
	}

}
