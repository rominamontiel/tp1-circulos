package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

		
	@Test
	public void crearUnCirculoConRadio2() {
		double radioEsperado = 2;
		Circulo obCirculo = new Circulo(2);
		Double radioDeEsteTest = obCirculo.obtenerRadio();
		assertEquals(radioEsperado,radioDeEsteTest,0);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		double radioEsperado = 3.7;
		Circulo objCirculo = new Circulo(3.7); 
		double radioDeEsteTest = objCirculo.obtenerRadio();
		assertEquals(radioEsperado,radioDeEsteTest,0);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		double radioEsperado = 5;
		Circulo objCirculo = new Circulo(5);
		double radioDeEsteTest = objCirculo.obtenerRadio();
		assertEquals(radioEsperado,radioDeEsteTest,0);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		double radioEsperado=10.9;
		Circulo objCirculo=new Circulo(10.9);
		double radioAsignadoEnEsteTest=objCirculo.obtenerRadio();
		assertEquals(radioEsperado,radioAsignadoEnEsteTest,0.0);
	}

		
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71() {
		
		Circulo objCirculo=new Circulo(9.8);
		double areaEsperada=301.71;  
		double areaObtenida=objCirculo.calcularArea();
		assertEquals(areaEsperada,areaObtenida,0.01); }
		
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio16Punto6Es104Punto30() {
		Circulo objCirculo=new Circulo(16.6);
		double perimetroEsperado=104.30;
		double perimetroObtenido=objCirculo.calcularPerimetro();
		
		assertEquals(perimetroEsperado,perimetroObtenido,0.01);
				
		
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
