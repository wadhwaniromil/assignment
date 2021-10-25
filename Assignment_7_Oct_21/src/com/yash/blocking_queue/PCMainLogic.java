package com.yash.blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PCMainLogic {

	public static void main(String[] args) {
		BlockingQueue b = new ArrayBlockingQueue<>(2);

		Thread tp1 = new Thread(new Producer(b), "Producer-1");
		tp1.start();

		Thread tp2 = new Thread(new Producer(b), "Producer-2");
		tp2.start();

		Thread tc1 = new Thread(new Consumer(b), "Consumer-1");
		tc1.start();
		
		Thread tc2 = new Thread(new Consumer(b), "Consumer-2");
		tc2.start();
	}

}
