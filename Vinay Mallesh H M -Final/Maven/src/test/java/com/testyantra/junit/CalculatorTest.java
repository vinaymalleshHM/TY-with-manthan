package com.testyantra.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	//Calculator c = new Calculator();

	private Calculator c;
	@BeforeEach
	public void createObj() {
		c= new Calculator();
	}

	@Test
	public void testAdd() {
		//Calculator c = new Calculator();
		//c = new Calculator();

		int res = c.add(10, 20);
		assertEquals(30, res);
	}
	@Test
	public void testDiv() {
		//Calculator c = new Calculator();
		//c = new Calculator();

		int res = c.div(50, 10);
		assertEquals(5, res);
	}

	@Test
	@Disabled
	public void testDivForException() {
		//Calculator c = new Calculator();
		//c = new Calculator();

		assertThrows(ArithmeticException.class, ()->c.div(10,0));
	}
}
