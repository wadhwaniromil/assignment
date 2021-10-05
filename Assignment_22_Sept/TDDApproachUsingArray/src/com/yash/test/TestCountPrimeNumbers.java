package com.yash.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.service.CountPrimeNumbers;

public class TestCountPrimeNumbers {

	private CountPrimeNumbers countPrime;
	

	@Before
	public void setUp() {
		countPrime = new CountPrimeNumbers();
	}
	
	@After
	public void tearDown() {
		countPrime = null;
	}
	
	@Test
	public void testCountPrimeNumberPositive() {
		int[] arr = {1, 2, 4, 12, 11, 15, 18, 23};
		int expected = 3;
		int actual = countPrime.countNumberOfPrime(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCountPrimeNumberNegative() {
		int[] arr = {1, 2, 4, 12, 11, 15, 18, 23};
		int unexpected = 4;
		int actual = countPrime.countNumberOfPrime(arr);
		assertNotEquals(unexpected, actual);
	}
	
	@Test
	public void testCountPrimeNumberInArrayLength() {
		int[] arr = {};
		try {
			countPrime.countNumberOfPrime(arr);	
			assertTrue(false);
		} catch (Exception e) {
			// TODO: handle exception
			assertTrue(true);
		}
	}
}
