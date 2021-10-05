package com.yash.service;

import java.util.Arrays;

public class ForthLargestElement {

	public int getForthLargestElementFromArray(int[] arr) {
		// TODO Auto-generated method stub
		if (arr.length < 5) {
			throw new NegativeArraySizeException("Size of Array should be greater than 5");
		}
		Arrays.sort(arr);
		return arr[3];
	}

}
