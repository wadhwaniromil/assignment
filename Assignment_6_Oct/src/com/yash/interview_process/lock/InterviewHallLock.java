package com.yash.interview_process.lock;

public class InterviewHallLock {

	private String interviewHallName;

	public InterviewHallLock(String interviewHallName) {
		super();
		this.interviewHallName = interviewHallName;
	}

	public void scheduleInterview(CandidateLock candidate)
	{
		System.out.println(candidate.getCandidateName()+" entered "+ interviewHallName +" Interview Hall.");
		System.out.println(candidate.getCandidateName()+"'s interview under process.");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(candidate.getCandidateName()+"'s interview process is completed.");
		System.out.println("Thankyou!");
	}
}
