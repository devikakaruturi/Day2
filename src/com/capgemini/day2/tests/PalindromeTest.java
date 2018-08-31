package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Palindrome;

class PalindromeTest {

	@Test
	void test() {
		assertEquals(true,Palindrome.checkpalindrome(121));
	}

}
