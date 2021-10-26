package com.yash.student_record;

import java.util.List;
import java.util.stream.Collectors;

public class StudentRecordOnFirstNameFilter {

	public static void main(String[] args) {
		List<Student> listOfStudent = Student.getStudentList();
		List<Student> filterList = listOfStudent
				.stream()
				.filter(s->s.getFirstName().contains("ai"))
				.collect(Collectors.toList());
		
		System.out.println("List of students contains Ai in first name:");
		filterList.forEach(System.out::println);
	}
}
