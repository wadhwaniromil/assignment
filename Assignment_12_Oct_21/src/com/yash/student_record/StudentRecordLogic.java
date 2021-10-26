package com.yash.student_record;

public class StudentRecordLogic {

	public static void main(String[] args) {

		StudentBuilder sb = Student::new;
		Student s = sb.getInstance();
		
		s.setStudentFirstName("Akshay");
		s.setStudentLastName("Kumar");
		s.setStudentSem1Marks(45);
		s.setStudentSem2Marks(34);
		s.setStudentSem3Marks(54);
		s.setStudentSem4Marks(29);
		s.setStudentSem5Marks(31);
		s.setStudentSem6Marks(23);
		
		CalculateAverage calAvg = s::getAverageMarks;
		double averageMarks = calAvg.calculate();
		
		System.out.println("Student average marks are: ");
		System.out.println(averageMarks);
	}

}
