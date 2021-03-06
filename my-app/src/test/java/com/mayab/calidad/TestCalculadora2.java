package com.mayab.calidad;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculadora2 {
	
	static Calculadora calculadora;
	
	@BeforeClass
	public static void setup() {
		calculadora = new Calculadora();
	}

	@Test
	public void sumaPositivosTest() {
		float one = 4;
		float two = 4;
		float expectedResult = 8;
		float result = -1;
		
		result = calculadora.suma(one, two);
		
		//assertEquals(expectedResult, result,0);
		assertThat(result, is(expectedResult));
	}
	
	@Test
	public void restaPositivosTest() {
		float one = 4;
		float two = 2;
		float expectedResult = 2;
		float result = -1;
		
		result = calculadora.resta(one, two);
		
		//assertEquals(expectedResult, result,0);
		assertThat(result, is(expectedResult));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void dividirEntre0() {
		float one = 1;
		float two = 0;
		float expectedResult = Float.POSITIVE_INFINITY;
		float result = -1;
		
		result = calculadora.division(one, two);
		assertThat(result, is(expectedResult));
	}
	
	@Test
	public void dividir0Entre0() {
		float one = 1;
		float two = 0;
		float expectedResult = Float.NaN;
		float result = -1;
		
		result = calculadora.division(one, two);
		assertThat(result, is(expectedResult));
	}
	
	@Test
	public void dividirMayorA0() {
		float one = 44;
		float two = 11;
		float expectedResult = 4;
		float result = -1;
		
		result = calculadora.division(one, two);
		assertThat(result, is(expectedResult));
	}
	
	@After
	public void despues() {
		
	}
	
	@AfterClass
	public static void fin() {
		
	}

}
