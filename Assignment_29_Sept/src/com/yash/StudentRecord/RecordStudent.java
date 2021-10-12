package com.yash.StudentRecord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RecordStudent {
	private static List<Student> listOfStudent = new ArrayList<>();
	 
	public static void main(String[] args) {
		saveStudentRecord();
		boolean isListOfStudentsSerialized = new SerializeStudent().serializeStudentToResourceFile(listOfStudent);
		
		if (isListOfStudentsSerialized) {
			System.out.println("Record of students saved successfully");
		}else {
			System.out.println("An error occured while saving record");
		}
		System.out.println("Retrieving student list from record->");
		List<Student> listOfStudentFromRecord = new DeserializeStudent().deserializeStudentObject();
		
		Comparator<Student> c = (s1,s2)->{
			return s2.getStudentPercentage().compareTo(s1.getStudentPercentage());
		};
		Collections.sort(listOfStudentFromRecord, c);
		
		System.out.println("Sorted list of students->");
		for (Student student : listOfStudentFromRecord) {
				System.out.println(student);
		}
	}
	
	private static void saveStudentRecord() {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Please enter student details: ");
		
		
			for (int i = 1; i < 5; i++) {
				System.out.println("Please enter details for "+i+" student");
				System.out.println("Enter roll no.");
				int rollNo = sc.nextInt();
				System.out.println("Enter name");
				String studentName = sc.next();
				System.out.println("Enter sem 1 marks");
				int sem1 = sc.nextInt();
				System.out.println("Enter sem 2 marks");
				int sem2 = sc.nextInt();
				System.out.println("Enter sem 3 marks");
				int sem3 = sc.nextInt();
			
				Student student = new Student();
				student.setStudentRollNo(rollNo);
				student.setStudentname(studentName);
				student.setSem1Marks(sem1);
				student.setSem2Marks(sem2);
				student.setSem3Marks(sem3);
				
				listOfStudent.add(student);
			}
		}
	}
}
