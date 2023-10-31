package com.valtech.assignement.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.valtech.assignement.CatchyNumberFinder;

class CatchyNumberFinderTest {
CatchyNumberFinder cnf;
	@Test
	void testCalculateCatchiness() {
		assertEquals(4,cnf.calculateCatchiness("11112222") );
	}
	@Test
	void testFindCatchyNumber() {
		List<String> numbers = Arrays.asList("77777","6666456","11112222");
		String expectedCatchyNumber = "77777";
		assertEquals(expectedCatchyNumber, cnf.findCatchyNumber(numbers));
	}
	
	
 
	}


