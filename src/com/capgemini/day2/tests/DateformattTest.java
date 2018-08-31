package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Dateformatt;

class DateformattTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("17/apr/1996", Dateformatt.Convert("17,04,1996"));
	}

}
