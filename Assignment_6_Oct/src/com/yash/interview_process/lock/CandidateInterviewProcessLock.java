package com.yash.interview_process.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CandidateInterviewProcessLock {

	public static void main(String[] args) {
		InterviewHallLock interviewHall = new InterviewHallLock("Yash Technology Campus");
		Lock lock = new ReentrantLock(true);
		
		Thread candidate1 = new Thread(new CandidateLock("Ajay", interviewHall, lock));
		Thread candidate2 = new Thread(new CandidateLock("Akshay", interviewHall, lock));
		Thread candidate3 = new Thread(new CandidateLock("Karan", interviewHall, lock));
		
		candidate1.start();
		candidate2.start();
		candidate3.start();
	}

}
