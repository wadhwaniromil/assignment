package com.yash.array_sort;

public class SortMainLogic {

	public static void main(String[] args) {
		
		int[] array1={23,34,78,90};
		int[] array2={89,23};
		int[] array3={12,34,67};

		System.out.println("Main Thread:"+Thread.currentThread());
		
		Thread sortArray1=new Thread(new SortArray(array1),"Thread for Array1");
		sortArray1.start();
		
		Thread sortArray2=new Thread(new SortArray(array2),"Thread for Array2");
		sortArray2.start();
		
		Thread sortArray3=new Thread(new SortArray(array3),"Thread for Array3");
		sortArray3.start();

	}

}
