package com.yash.StudentRecord;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int studentRollNo;
	private String studentname;
	private int sem1Marks;
	private int sem2Marks;
	private int sem3Marks;
	
	public Student() {
		super();
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getSem1Marks() {
		return sem1Marks;
	}

	public void setSem1Marks(int sem1Marks) {
		this.sem1Marks = sem1Marks;
	}

	public int getSem2Marks() {
		return sem2Marks;
	}

	public void setSem2Marks(int sem2Marks) {
		this.sem2Marks = sem2Marks;
	}

	public int getSem3Marks() {
		return sem3Marks;
	}

	public void setSem3Marks(int sem3Marks) {
		this.sem3Marks = sem3Marks;
	}

	public Double getStudentPercentage() {
		return (double) ((getSem1Marks()+getSem2Marks()+getSem3Marks())/3);	
	}
	
	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentname=" + studentname + ", sem1Marks=" + sem1Marks
				+ ", sem2Marks=" + sem2Marks + ", sem3Marks=" + sem3Marks + "]";
	}

}
