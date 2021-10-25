package com.yash.interview_process;

public class Candidate implements Runnable {

	
	private String candidateName;
	private InterviewHall interviewHall;
	
	public Candidate(String candidateName, InterviewHall interviewHall) {
		super();
		this.candidateName = candidateName;
		this.interviewHall = interviewHall;
	}

	@Override
	public void run() {
		System.out.println(candidateName+" is waiting in queue.");
		synchronized (interviewHall) {
			interviewHall.scheduleInterview(this);
		}
		
	}

	public String getCandidateName() {
		return candidateName;
	}

	public InterviewHall getInterviewHall() {
		return interviewHall;
	}	
}
