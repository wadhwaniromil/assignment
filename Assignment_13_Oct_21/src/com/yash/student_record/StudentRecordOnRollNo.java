package com.yash.student_record;

import java.util.List;
import java.util.Comparator;

public class StudentRecordOnRollNo {

	public static void main(String[] args) {
		List<Student> listOfStudent = Student.getStudentList();
		
		Comparator<Student> comp = (s1,s2)->{
			if (s1.getRollNo() > s2.getRollNo()) {
				return 1;
			}else if (s1.getRollNo() < s2.getRollNo()) {
				return -1;
			}else {
				return 0;
			}
		};
		
		listOfStudent
		.stream()
		.sorted(comp)
		.forEach(System.out::println);

	}

}
