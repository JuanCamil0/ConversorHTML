package co.com.tns.conversor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversorTest {
	
	Conversor conversor;
	
	@Before
	public void instanciarConversor() {
		conversor = new Conversor();
	}
	
	@Test
	public void confirmarExistenciaHashTag() {
		
		String cadena = "# HolaMundo";
		
		Assert.assertTrue(conversor.hasHashTag(cadena));
		
	}
	
	@Test
	public void confirmarNoExistenciaHashTag() {
		
		String cadena = " HolaMundo";
		
		Assert.assertFalse(conversor.hasHashTag(cadena));
		
	}
	
	@Test
	public void contarNumerodeHashTagsMenora7() {
		
		String cadena = "###### HolaMundo";
		
		Assert.assertTrue((conversor.determinarNumerosHashTag(cadena)));
		
	}
	
	@Test
	public void contarNumerodeHashTagsNoMenora7() {
		
		String cadena = "####### HolaMundo";
		
		Assert.assertFalse(conversor.determinarNumerosHashTag(cadena));
		
	}
	
	@Test
	public void verificarEspacioDespuesDeHashtag() {
		
		String cadena = "######## HolaMundo";
		
		Assert.assertTrue(conversor.hasSpace(cadena));
		
	}
	
	@Test
	public void convertStringToHTMLReturnRight() {
		
		String cadena = "###### Tech And Solve";
		String expected = "<H6>Tech And Solve</H6>";
		
		String actual = conversor.formatear(cadena);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void convertStringToHTMLReturnWrong() {
		
		String cadena = "####### Mal";
		String expected = "####### Mal";
		
		String actual = conversor.formatear(cadena);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	

}
