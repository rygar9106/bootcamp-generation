package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	private final Calculator calculator = new Calculator();
	@Test
	void addition() {
		assertEquals(8, calculator.addNumbers(5, 3));
	}
	@Test
	void resta() {
		assertEquals(8, calculator.subtractNumbers(11, 3));
	}
	@Test
	void multi() {
		assertEquals(25, calculator.multiplyNumbers(5, 5));
	}
	@Test
	void divi() {
		assertEquals(5, calculator.divideNumbers(15, 3));
	}
}
