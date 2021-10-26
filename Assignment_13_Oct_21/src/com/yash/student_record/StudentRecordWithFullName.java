package com.yash.student_record;

import java.util.List;

public class StudentRecordWithFullName {

	public static void main(String[] args) {
		List<Student> listOfStudents = Student.getStudentList();
		
		listOfStudents
		.forEach(s->{
			System.out.println(s.getFirstName().toUpperCase()+" "+s.getLastName().toUpperCase());
		});

	}

}
