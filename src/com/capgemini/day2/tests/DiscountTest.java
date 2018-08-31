package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Discount;

class DiscountTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertArrayEquals(new double[] {350,650},Discount.calculate(1000));
	}

}
