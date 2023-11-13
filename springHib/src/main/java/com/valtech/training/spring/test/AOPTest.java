package com.valtech.training.spring.test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.valtech.training.spring.Airthemetic;

class AOPTest {
	
	private ClassPathXmlApplicationContext appCtx;

	@BeforeEach
	void intitialized() {
		appCtx = new ClassPathXmlApplicationContext("aop.xml");
	}
	@AfterEach
	void closeall(){
		appCtx.close();
	}

	@Test
	void test() {
		
		Airthemetic arith = (Airthemetic) appCtx.getBean(Airthemetic.class);
		System.out.println(arith.getClass().getName());
		System.out.println(arith);

		assertEquals(5, arith.add(2,3));
		assertEquals(1, arith.sub(2,3));
		assertEquals(5, arith.add(3,2));
		try {
			arith.div(5, 0);
			fail("No Exception Occurs");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
