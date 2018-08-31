package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Armstrong;

class ArmstrongTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(true,Armstrong.checkArmstrongNumber(153));
		assertEquals(false,Armstrong.checkArmstrongNumber(145));
		assertEquals(true,Armstrong.checkArmstrongNumber(-153));
		assertEquals(false,Armstrong.checkArmstrongNumber(0456));
		assertEquals(false,Armstrong.checkArmstrongNumber(0x153));
		assertEquals(false,Armstrong.checkArmstrongNumber('a'));
	}

}
