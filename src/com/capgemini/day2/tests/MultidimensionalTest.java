package com.capgemini.day2.tests;

//import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Multidimensional;

class MultidimensionalTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("Found",Multidimensional.searchElement(new int[][] {{1,2},{3,4}}));
	}

}
