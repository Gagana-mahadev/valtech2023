package com.valtech.training.day2.test;
import com.valtech.training.day2.Arithmetic;
import com.valtech.training.day2.ArithmeticImpl;
import com.valtech.training.day2.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Arithmetic Tests")
class ArithmeticTest {
	
	private Arithmetic arithmetic ;//= new ArithmeticImpl();
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All");
	}
	
	@BeforeEach
	void sample() {
		System.out.println("Init...");
		arithmetic = new ArithmeticImpl();
	}
	
	
	@AfterEach
	void sample1() {
		System.out.println("Destroy...");
	}

	@Test @DisplayName("To check if +ve Nos, - ve Nos are added Correctly")
	void testAdd() {
		assertEquals(5,arithmetic.add(2, 3));
		assertEquals(5,arithmetic.add(3, 2));
		assertEquals(5,arithmetic.add(5, 0));
		assertEquals(5,arithmetic.add(5, -0));
		assertEquals(-5,arithmetic.add(-2, -3));
		assertEquals(-5,arithmetic.add(-8, 3));
		
	}

	@Test
	void testSub() {
		
	}

	@Test
	void testMul() {
		
	}
	
	
	@Test()
	void testDivByZero() {
		assertThrows(DivideByZeroException.class, () -> arithmetic.div(5, 0));
		
	}

	@Test
	void testDiv() {
		
		assertEquals(1.666,5.0/3,0.001,"value not in range");//expected values ,actual value,approximate value
		assertEquals(2,arithmetic.div(4, 2));
		assertEquals(2,arithmetic.div(-6, -3));
		try {
		assertEquals(2,arithmetic.div(4, 0));
		fail("Should have throws Arithmetic Exception");
		}catch(DivideByZeroException ex) {
			
		}
	}

}
