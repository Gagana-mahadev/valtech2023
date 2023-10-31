package com.valtech.assignement.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.valtech.assignement.HtmlTagCounter;

class HtmlTagCounterTest {

	@Test
	void testMain() {
		 HtmlTagCounter htmlTagCounter = new HtmlTagCounter();
	        try {
	            htmlTagCounter.main(new String[]{});
	        } catch (IOException e) {
	            fail("An exception occurred while running the HtmlTagCounter: " + e.getMessage());
	        }
	}

}
