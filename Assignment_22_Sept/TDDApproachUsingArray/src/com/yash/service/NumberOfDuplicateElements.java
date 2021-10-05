package com.yash.service;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDuplicateElements {

	public int findNumberOfDuplicates(String[] arr) {
		// TODO Auto-generated method stub
		if (arr.length < 10) {
			throw new NegativeArraySizeException("Size of array should be greater than 10");
		}
		int numberOfDuplicate = 0;
		Set<String> stringSet=new HashSet<>();
		for (String string : arr) {
			boolean isAdded = stringSet.add(string);
			if(isAdded == false) {
				numberOfDuplicate++;
			}
		}
		return numberOfDuplicate;
	}

}
