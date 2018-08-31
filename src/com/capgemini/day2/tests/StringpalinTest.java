package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Stringpalin;

class StringpalinTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertArrayEquals(new String[] {"121","787","545","454",null,null,null,null,null,null},Stringpalin.orderPalindrome(new String[] {"121","154","234","787","545","454","678","789","876","890"}));
	}

}
