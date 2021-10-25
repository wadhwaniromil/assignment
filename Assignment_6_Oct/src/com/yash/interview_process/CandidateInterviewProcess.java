package com.yash.interview_process;

public class CandidateInterviewProcess {

	public static void main(String[] args) {
		InterviewHall interviewHall = new InterviewHall("Yash Technology Campus");
		
		Thread candidate1 = new Thread(new Candidate("Ajay", interviewHall));
		Thread candidate2 = new Thread(new Candidate("Akshay", interviewHall));
		Thread candidate3 = new Thread(new Candidate("Karan", interviewHall));
		
		candidate1.start();
		candidate2.start();
		candidate3.start();
	}

}
