package com.yash.array_sort;

import java.util.Arrays;

public class SortArray implements Runnable {

	private int[] arr;
		
	public SortArray(int[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public void run() {
		System.out.println("SortArray Thread :"+Thread.currentThread());
		sortArray();
	}
	
	private void sortArray() {
		System.out.println("Original Array\n");
		for(int i: arr) {
			System.out.println(i);	
		}
		Arrays.sort(arr);
		System.out.println("Sorted Array\n");
		for(int i: arr) {
			System.out.println(i);	
		}
	}
}
