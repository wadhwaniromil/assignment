package com.yash.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.service.NumberOfDuplicateElements;

public class TestNumberOfDuplicateElements {

	private NumberOfDuplicateElements numberOfDuplicate;
	
	
	@Before
	public void setUp() {
		numberOfDuplicate = new NumberOfDuplicateElements();
	}
	
	@After
	public void tearDown() {
		numberOfDuplicate = null;
	}
	
	@Test
	public void testNumberOfDuplicatePositive() {
		String[] arr = {"hello", "hola", "hi", "hola", "bonjour", "nin hao", "ola", "bonjour", "privet", "ciao"};
		int expected = 2;
		int actual = numberOfDuplicate.findNumberOfDuplicates(arr);
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testNumberOfDuplicateNegative() {
		String[] arr = {"hello", "hola", "hi", "hey", "hola", "bonjour", "nin hao", "ola", "privet", "ciao"};
		int expected = 2;
		int actual = numberOfDuplicate.findNumberOfDuplicates(arr);
		if (actual != expected) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}
	
	@Test
	public void testNumberOfDuplicateInArrayGreaterThan10() {
		String[] arr = {"hello", "hola", "hi", "hey", "hola", "bonjour", "nin hao", "ola"};
		try {
			numberOfDuplicate.findNumberOfDuplicates(arr);
			assertTrue(false);
		} catch (Exception e) {
			// TODO: handle exception
			assertTrue(true);
		}
	}
}