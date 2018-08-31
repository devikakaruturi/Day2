package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Absolutedifference;

class Absolutediiference {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(1,Absolutedifference.calculateabs(8,new int[] {1,2,3,4,5,4,3,2},5));
	}

}
