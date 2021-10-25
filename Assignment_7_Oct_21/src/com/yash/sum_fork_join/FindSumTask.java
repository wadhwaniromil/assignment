package com.yash.sum_fork_join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FindSumTask extends RecursiveTask<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int sum=0;
	private final int[] sumArray;
	private final int threshold ; 
	private int start;
	private int end;
	private int mid;
	
	public FindSumTask(int[] sumArray, int start, int end, int threshold) {
		super();
		this.sumArray = sumArray;
		this.threshold = threshold;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		if(end-start>threshold) {
			for (int i = start; i <= end; i++) {
				sum+=sumArray[i];
			}
			return sum;
		}
		else {
			mid = end-start/2 +start;
			FindSumTask t1 = new FindSumTask(sumArray, start, mid, threshold);
			t1.fork();
			FindSumTask t2 = new FindSumTask(sumArray, mid, end, threshold);
			int addExact = Math.addExact(t2.compute(), t1.join());
			return addExact;
		}
	}
	
	public static void main(String[] args) {
		
		ForkJoinPool pool=new ForkJoinPool();
		
		int[] data=new int[10000];
		for(int i=0;i<10000;i++) {
			data[i]=i;
		}
		
		FindSumTask f = new FindSumTask(data, 0, data.length-1, data.length/16);
		Integer r = pool.invoke(f);
		System.out.println("Result of Sum Task: " + r);
		
		
	}
}
