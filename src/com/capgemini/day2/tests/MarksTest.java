package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Marks;

class MarksTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("Passed",Marks.caluculate(63,65,67));
		assertEquals("Promoted",Marks.caluculate(36,65,67));
		assertEquals("Failed",Marks.caluculate(65,30,31));
		
	}

}
