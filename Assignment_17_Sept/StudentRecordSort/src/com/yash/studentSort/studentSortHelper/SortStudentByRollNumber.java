package com.yash.studentSort.studentSortHelper;

import java.util.Comparator;

import com.yash.studentSort.Student;

public class SortStudentByRollNumber implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getRollNo()-o2.getRollNo();
	}

}
