package com.yash.student_record;

import java.util.List;
import java.util.stream.Collectors;

public class StudentRecordOnFirstNameStart {

	public static void main(String[] args) {
		List<Student> listOfStudent = Student.getStudentList();
		List<Student> filterStudent = listOfStudent
				.stream()
				.filter(s->s.getFirstName().startsWith("K"))
				.collect(Collectors.toList());
		
		System.out.println("List of students name starts with K");
		filterStudent.forEach(System.out::println);
	}
}
