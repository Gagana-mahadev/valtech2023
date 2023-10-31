package com.valtech.assignement.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.valtech.assignement.CSSParser;

class CSSParserTest {
	
	CSSParser css;
	
	
	@Test
	void testHexToRgb() {
		assertEquals(0,3,51, css.hexToRgb("333"));
	}
	
//	@Test
//    void testmain()
//    {
//        
//		String testFilePath ="C:/Users/Gagana.CM/eclipse-workspace/corejava/src/com/valtech/assignement/styles.css";; // Replace with your CSS file path
//		CSSParser cssParser = new CSSParser();
//		 cssParser.main(new String[]{});
//    }
//	@Test
//	void testhexToRgb() {
//    	
//        CSSParser cssParser = new CSSParser();
//        
//        // Test case 1: Test a known hex value and check the RGB conversion
//        String hexValue = "FFA500"; // Example hex value for orange color
//        String expectedRGB = "rgb(255,165,0)"; // Expected RGB value for the given hex
//        
//        String actualRGB = cssParser.hexToRgb(hexValue);
//        
//        assertEquals(expectedRGB, actualRGB, "Hex to RGB conversion failed for " + hexValue);
//}

}
