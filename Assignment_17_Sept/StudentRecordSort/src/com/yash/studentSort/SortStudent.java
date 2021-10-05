package com.yash.studentSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.yash.studentSort.studentSortHelper.SortStudentByFirstName;
import com.yash.studentSort.studentSortHelper.SortStudentByLastName;
import com.yash.studentSort.studentSortHelper.SortStudentByRollNumber;
import com.yash.studentSort.studentSortHelper.StudentSortByAge;
import com.yash.studentSort.studentSortHelper.StudentSortByPercentage;

public class SortStudent {

	private static Scanner sc;
	private static ArrayList<Student> list;

	public static void main(String[] args) {
		
		System.out.println("<<<<< Student Portal >>>>>\n");
		System.out.print("Please enter number of students to be registered: ");
		int studentCount = 0;	
		try (Scanner sc = new Scanner(System.in)) {
			studentCount=sc.nextInt();
			registerStudentRecords(studentCount);
			printStudentSortedData();
			
		}catch (InputMismatchException e) {
			System.err.println(e.getMessage());
		}
	}

	public static boolean registerStudentRecords(int studentCount) throws InputMismatchException {
		sc = new Scanner(System.in);
		list = new ArrayList<Student>();
		
		for (int i = 1; i <= studentCount; i++) 
		{
			System.out.println("\n<<<<< Student " + i + " Record >>>>>");
			System.out.print("Enter Student Roll no: ");
			int rollNo = sc.nextInt();
			System.out.print("Enter Student Firstname : ");
			String firstName = sc.next();
			System.out.print("Enter Student Lastname : ");
			String lastName = sc.next();
			System.out.print("Enter Student Age : ");
			int age = sc.nextInt();
			System.out.print("Enter Student Semester 1 marks : ");
			double semster1Mark = sc.nextDouble();
			System.out.print("Enter Student Semester 2 marks : ");
			double semster2Mark = sc.nextDouble();
			System.out.print("Enter Student Semester 3 marks : ");
			double semster3Mark = sc.nextDouble();
			Student student = new Student(rollNo, firstName, lastName, age, semster1Mark, semster2Mark, semster3Mark);
		
			list.add(student);
		}
		return true;
	}
		
	public static void printStudentSortedData() {
			System.out.println("\n<<<<<< Student Sorted Record >>>>>>");
			System.out.println("Enter 1 to display record by student Roll number");
			System.out.println("Enter 2 to display record by student Age");
			System.out.println("Enter 3 to display record by student First name");
			System.out.println("Enter 4 to display record by student Last name");
			System.out.println("Enter 5 to display record by student Percentage");
			System.out.println("Enter 0 to Exit");

			System.out.print("\nEnter your option: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Collections.sort(list, new SortStudentByRollNumber());
				printStudentData();
				break;
			case 2:
				Collections.sort(list, new StudentSortByAge());
				printStudentData();
				break;
			case 3:
				Collections.sort(list, new SortStudentByFirstName());
				printStudentData();
				break;
			case 4:
				Collections.sort(list, new SortStudentByLastName());
				printStudentData();
				break;
			case 5:
				Collections.sort(list, new StudentSortByPercentage());
				printStudentData();
				break;
			case 6:
				System.out.println("<<<<<< Have a nice day!>>>>>>");
				break;
			default:
				System.out.println("<<<<< Please enter valid choice>>>>>");
			}
	}

	public static void printStudentData() {
		for(Student s: list){
			System.out.println(s);
		}
	}
		
}
