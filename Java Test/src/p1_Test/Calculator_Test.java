package p1_Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import p1.Calculator;

class Calculator_Test {

	@Test
	void testTime() {
		Calculator c=new Calculator(5);
		c.time(2);
		assertEquals(10,c.getAmount(),0.01);

	}
	@Test
	void testDivide() {
		Calculator c= new Calculator(10);
		c.divide(0);
		assertNotEquals(6,c.getAmount(),0.0000001);
		
		
	}
	
	@Test
	void testRoundAmount() {
		Calculator c= new Calculator(1);
		System.out.println(c.roundAmount(123.12345));
		assertEquals("1,1234.12",c.roundAmount(1234.12345));
		
	}
	@Test
	void testDenominatorisZero() {
		Calculator c= new Calculator(1);
		assertTrue(c.denominatorIsZero(0));
	}
	
	

}
