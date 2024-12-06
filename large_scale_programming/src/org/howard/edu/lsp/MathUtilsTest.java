package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class MathUtilsTest {
	
	private MathUtils mathUtils;

	@BeforeEach
	public void setUp() {
		mathUtils = new MathUtils();
	}
	
	@Test
	@DisplayName("Test case for factorial")
	public void testFactorial() {
		assertEquals(1, mathUtils.factorial(1));
		assertEquals(24, mathUtils.factorial(4));
	}
	
	@Test
	@DisplayName("Test case for isPrime")
	public void testIsPrime() {
		assertEquals(false, mathUtils.isPrime(4));
		assertEquals(true, mathUtils.isPrime(7));
	}
	
	@Test
	@DisplayName("Test case for gcd")
	public void testGCD() {
		assertEquals(5, mathUtils.gcd(10, 5));
		assertEquals(25, mathUtils.gcd(125, 50));
	}
	
	@Test
    @DisplayName("Test case for exceptions")
    public void testIllegalArgumentException() {
    	Throwable exception = assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-5));
        assertEquals("Number must be non-negative", exception.getMessage());
        Throwable exception2 = assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0,0));
        assertEquals("Both numbers cannot be zero", exception2.getMessage());
    };
}


