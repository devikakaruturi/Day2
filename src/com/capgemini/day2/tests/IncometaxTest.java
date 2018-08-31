package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Incometax;

class IncometaxTest {

	@Test
	void test() {
		assertEquals(0,Incometax.caluculate1(10000));
		assertEquals(28000,Incometax.caluculate1(280000));
		assertEquals(96000,Incometax.caluculate1(480000));
		assertEquals(174000,Incometax.caluculate1(580000));
	}

}
