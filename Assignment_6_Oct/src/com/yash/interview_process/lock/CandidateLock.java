package com.yash.interview_process.lock;

import java.util.concurrent.locks.Lock;

public class CandidateLock implements Runnable {

	
	private String candidateName;
	private InterviewHallLock interviewHall;
	private Lock lock;
	
	public CandidateLock(String candidateName, InterviewHallLock interviewHall, Lock lock) {
		super();
		this.candidateName = candidateName;
		this.interviewHall = interviewHall;
		this.lock = lock;
	}

	@Override
	public void run() {
		System.out.println(candidateName+" is waiting in queue.");
		synchronized (interviewHall) {
			lock.lock();
			interviewHall.scheduleInterview(this);
			lock.unlock();
		}
		
	}

	public String getCandidateName() {
		return candidateName;
	}

	public InterviewHallLock getInterviewHall() {
		return interviewHall;
	}	
}
