package com.yash.dob;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class FindNumberOfYears {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate pre = LocalDate.of(1947, Month.AUGUST, 15);
		Period p = Period.between(pre, today);
		System.out.println("Number of years from 15th August 1947 till now will be:");
		System.out.println(p.getYears());
	};
}
