package com.yash.functional_interface;

import java.util.Arrays;

public class FindMaxNumber {
	public static void main(String[] args) {
		int[] nums = {4,7,3,5,9,1};
		
		MaxNumber max = (n)->{
			Arrays.sort(n);
			return n[n.length-1];
		};
		
		System.out.println("Given array: ");
		for (int i : nums) {
			System.out.print(i+", ");
		}
		System.out.println("");
		int n = max.max(nums);
		System.out.println("Max number: "+ n);
	}
}
