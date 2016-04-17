package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	// --- CALCULAR RADIOS --	
	
	@Test
	public void crearUnCirculoConRadio2() {
		double radioEsperado = 2;
		Circulo obCirculo = new Circulo(2);
		double radioDeEsteTest = obCirculo.obtenerRadio();
		assertEquals(radioEsperado,radioDeEsteTest,0);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		double radioEsperado = 3.7;
		Circulo objCirculo = new Circulo(3.7); //para no olvidarme: esta linea le manda 3.7 al valor del radio.
		double radioDeEsteTest = objCirculo.obtenerRadio();
		assertEquals(radioEsperado,radioDeEsteTest,0);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		double radioEsperado = 5;
		Circulo objCirculo = new Circulo(5);
		double radioDeEsteTest = objCirculo.obtenerRadio();
		assertEquals(radioEsperado,radioDeEsteTest,1);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		double radioEsperado=10.9;
		Circulo objCirculo=new Circulo(10.9);
		double radioAsignadoEnEsteTest=objCirculo.obtenerRadio();
		assertEquals(radioEsperado,radioAsignadoEnEsteTest,1);
	}

	// ---** CALCULAR AREAS **--
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		
		Circulo objCirculo=new Circulo(9.8);
		double areaEsperada=615.73;
		double areaObtenida=objCirculo.calcularArea();
		assertNotEquals(areaEsperada,areaObtenida,2);
		//Es 301,71
	}
	
	//Version 2 del AREA
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73VERSION2() {
		
		Circulo objCirculo=new Circulo(9.8);
		double areaEsperada=301.71;   //--- **CAMBIO AC¡**
		double areaObtenida=objCirculo.calcularArea();
		assertEquals(areaEsperada,areaObtenida,2); }
		//Es 301,71
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo objCirculo=new Circulo(16.6);
		double perimetroEsperado=865.67;
		double perimetroObtenido=objCirculo.calcularPerimetro();
		
		assertNotEquals(perimetroEsperado,perimetroObtenido,2);
				
		
	}
	
	// --- *** Tip de Ayuda Verde *** ---
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente m√©todo se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
