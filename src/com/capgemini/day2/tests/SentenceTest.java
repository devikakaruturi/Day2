package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Sentence;

class SentenceTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("this is a sentence", Sentence.correction("this is is a sentence","is",3));
	}

}
