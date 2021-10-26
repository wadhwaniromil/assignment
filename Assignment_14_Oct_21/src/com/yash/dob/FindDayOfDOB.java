package com.yash.dob;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class FindDayOfDOB {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your DOB in  DD-MM-YYYY formart: ");
			String dob = sc.next();
			DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate birthDate = LocalDate.parse(dob, dt);
			LocalDate birthDateThisYear = LocalDate.of(LocalDate.now().getYear(), birthDate.getMonth(), birthDate.getDayOfMonth());
			System.out.println("Your DOB is: "+dob);
			System.out.println("Your birthday this year will be: "+birthDateThisYear.getDayOfWeek());
			System.out.println("Your birthday next year will be: "+birthDateThisYear.plusYears(1).getDayOfWeek());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
