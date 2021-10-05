package com.yash.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.service.ForthLargestElement;

public class TestForthLargestElement {

	
	private ForthLargestElement forthLargest;
	
	@Before
	public void setUp() {
		forthLargest = new ForthLargestElement();
	}
	
	@After
	public void tearDown() {
		forthLargest = null;
	}
	
	@Test
	public void testForthLargestElementPositive() {
		int[] arr = {45, 9, 67, 34, 52, 14, 27};
		int expected = 34;
		int actual = forthLargest.getForthLargestElementFromArray(arr);
		assertEquals(expected, actual);
	}
	

	@Test
	public void testForthLargestElementNegative() {
		int[] arr = {45, 9, 67, 34, 52, 14, 27};
		int expected = 52;
		int actual = forthLargest.getForthLargestElementFromArray(arr);
		if (actual != expected) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}
	
	@Test
	public void testForthLargestElementInArrayGreatherThan5() {
		int[] arr = {9, 34, 14, 27};
		try {
			forthLargest.getForthLargestElementFromArray(arr);
			assertTrue(false);
		} catch (Exception e) {
			// TODO: handle exception
			assertTrue(true);
		}
	}
}
