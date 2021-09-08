package com.yash.object;

public class Student {
	
	int rollNumber;
	String studentFirstName;
	String studentLastName;
	int studentAge;
	
	public String toString() {
		return "Student [ rollNumber = " + rollNumber +
				" studentFirstName = " + studentFirstName +
				" studentLastName = " + studentLastName +
				" studentAge = " + studentAge +
				" ]";
	}
	
	public int hashCode() {
		int result = 0;
		result = result + rollNumber;
		result = result + studentAge;
		result = result + ((studentFirstName == null) ? 0 : studentFirstName.hashCode());
		result = result + ((studentLastName == null) ? 0 : studentLastName.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Student student1 = (Student) obj;
		if (rollNumber != student1.rollNumber)
			return false;
		if (studentAge != student1.studentAge)
			return false;
		if (studentFirstName == null) {
			if (student1.studentFirstName != null)
				return false;
		} else if (!studentFirstName.equals(student1.studentFirstName))
			return false;
		if (studentLastName == null) {
			if (student1.studentLastName != null)
				return false;
		} else if (!studentLastName.equals(student1.studentLastName))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.print(s.toString());
	}
	
}