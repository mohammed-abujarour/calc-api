package de.abujarour.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import de.abujarour.calc.logic.Calculator;

@SpringBootTest
class CalculatorApplicationTests {
	
	
	@Test
	void testAdd() {
		double a = 10;
		double b = 22;
		Assertions.assertEquals(Calculator.add(a, b), 32);
		Assertions.assertEquals(Calculator.add(a, -a), 0);
	}

}
