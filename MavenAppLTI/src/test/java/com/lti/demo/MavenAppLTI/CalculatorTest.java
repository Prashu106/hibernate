package com.lti.demo.MavenAppLTI;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addtest1() {
		int res = new Calculator().add(5, 6);
		assertEquals(11, res);
				
	}
	public void addtest2() {
		int res = new Calculator().add(1, 2);
		assertEquals(3, res);
				
	}
	public void prodtest3() {
		int res = new Calculator().prod(5, 6);
		assertEquals(30, res);
				
	}
	public void prodtest4() {
		int res = new Calculator().prod(4, 6);
		assertEquals(24, res);
				
	}

}
