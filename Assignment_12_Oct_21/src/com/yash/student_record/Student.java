package com.yash.student_record;

public class Student {
	private String studentFirstName;
	private String studentLastName;
	private int studentSem1Marks;
	private int studentSem2Marks;
	private int studentSem3Marks;
	private int studentSem4Marks;
	private int studentSem5Marks;
	private int studentSem6Marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getStudentSem1Marks() {
		return studentSem1Marks;
	}

	public void setStudentSem1Marks(int studentSem1Marks) {
		this.studentSem1Marks = studentSem1Marks;
	}

	public int getStudentSem2Marks() {
		return studentSem2Marks;
	}

	public void setStudentSem2Marks(int studentSem2Marks) {
		this.studentSem2Marks = studentSem2Marks;
	}

	public int getStudentSem3Marks() {
		return studentSem3Marks;
	}

	public void setStudentSem3Marks(int studentSem3Marks) {
		this.studentSem3Marks = studentSem3Marks;
	}

	public int getStudentSem4Marks() {
		return studentSem4Marks;
	}

	public void setStudentSem4Marks(int studentSem4Marks) {
		this.studentSem4Marks = studentSem4Marks;
	}

	public int getStudentSem5Marks() {
		return studentSem5Marks;
	}

	public void setStudentSem5Marks(int studentSem5Marks) {
		this.studentSem5Marks = studentSem5Marks;
	}

	public int getStudentSem6Marks() {
		return studentSem6Marks;
	}

	public void setStudentSem6Marks(int studentSem6Marks) {
		this.studentSem6Marks = studentSem6Marks;
	}

	@Override
	public String toString() {
		return "Student [studentFirstName=" + studentFirstName + ", studentLastName=" + studentLastName
				+ ", studentSem1Marks=" + studentSem1Marks + ", studentSem2Marks=" + studentSem2Marks
				+ ", studentSem3Marks=" + studentSem3Marks + ", studentSem4Marks=" + studentSem4Marks
				+ ", studentSem5Marks=" + studentSem5Marks + ", studentSem6Marks=" + studentSem6Marks + "]";
	}
	
	public double getAverageMarks() {
		return (studentSem1Marks+studentSem2Marks+studentSem3Marks+studentSem4Marks+studentSem5Marks+studentSem6Marks);
	}
}
