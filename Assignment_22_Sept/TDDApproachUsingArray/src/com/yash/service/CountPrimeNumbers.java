package com.yash.service;

public class CountPrimeNumbers {

	public int countNumberOfPrime(int[] arr) {
		// TODO Auto-generated method stub
		int countOfPrimeNumber = 0;
		if (arr.length < 1) {
			throw new RuntimeException("Array can not be empty");
		}
		for (int i : arr) {
			if (isPrime(i)) {
				countOfPrimeNumber++;	
			}
		}
		return countOfPrimeNumber;
	}
	
	static boolean isPrime(int n){
	 
		if (n <= 1)
			return false;
	 
		else if (n == 2)
			return true;
	 
		else if (n % 2 == 0)
			return false;
	 
		for (int i = 3; i <= Math.sqrt(n); i += 2)
		{
			if (n % i == 0)
				return false;
	        }
	        return true;
	    }	
}
