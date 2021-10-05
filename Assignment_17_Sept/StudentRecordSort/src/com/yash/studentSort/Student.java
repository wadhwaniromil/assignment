package com.yash.studentSort;

public class Student {

	private int rollNo;
	private String firstName;
	private String lastName;
	private int age;
	private double semester1Marks;
	private double semester2Marks;
	private double semester3Marks;
	
	public Student() {
		super();
	}
	
	public Student(int rollNo, String firstName, String lastName, int age, double semester1Marks, double semester2Marks,
			double semester3Marks) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.semester1Marks = semester1Marks;
		this.semester2Marks = semester2Marks;
		this.semester3Marks = semester3Marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSemester1Marks() {
		return semester1Marks;
	}

	public void setSemester1Marks(double semester1Marks) {
		this.semester1Marks = semester1Marks;
	}

	public double getSemester2Marks() {
		return semester2Marks;
	}

	public void setSemester2Marks(double semester2Marks) {
		this.semester2Marks = semester2Marks;
	}

	public double getSemester3Marks() {
		return semester3Marks;
	}

	public void setSemester3Marks(double semester3Marks) {
		this.semester3Marks = semester3Marks;
	}
	
	public double getStudentPercentage() {
		double obtainedMarks = (semester1Marks + semester2Marks + semester3Marks);
		double percent = (obtainedMarks/300)*100;
		return percent;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", semester1Marks=" + semester1Marks + ", semester2Marks=" + semester2Marks + ", semester3Marks="
				+ semester3Marks + "]";
	}
}
