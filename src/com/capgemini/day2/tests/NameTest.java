package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.test.Names;

class NameTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		String s1[]= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dave","Kity","Meery","Smith","Jhonson","Bill","William","Jones","Brown","Daves","Miller","Willson","Moore","Taylor","Adason","Thomas","Jackson"};
		assertEquals(2,Names.findDuplicates(s1,"Sam"));
	}

}
