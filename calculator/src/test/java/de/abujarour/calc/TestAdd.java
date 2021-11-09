/**
 * 
 */
package de.abujarour.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import de.abujarour.calc.logic.Calculator;

/**
 * @author mohammed
 *
 */

@SpringBootTest

public class TestAdd {
	
	private double a = 100.4;
	private double b = -20;
	private double c = 12.3;
	private double d = -5.5;
	
	@Test	
	void testAddCase1() {		
		Assertions.assertEquals(Calculator.add(a, b), 80.4);		
	}

	@Test	
	void testAddCase2() {		
		Assertions.assertEquals(Calculator.add(a, -a), 0);		
	}
	
	@Test	
	void testAddCase3() {		
		Assertions.assertEquals(Calculator.add(b, -b), 0);		
	}

}
