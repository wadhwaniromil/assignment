package com.yash.dob;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeInDifferentCities {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
	
		ZoneId zoneId = ZoneId.of("Europe/London");
		LocalDateTime timeInLondon = LocalDateTime.now(zoneId);
		System.out.println("Time in London: "+timeInLondon.format(df));
	
		zoneId  = ZoneId.of("Europe/Berlin");
		LocalDateTime timeInBerlin= LocalDateTime.now(zoneId);
		System.out.println("Time in Berlin: "+timeInBerlin.format(df));
	
		zoneId  = ZoneId.of("America/New_York");
		LocalDateTime timeInNewYork= LocalDateTime.now(zoneId);
		System.out.println("Time in NewYork: "+timeInNewYork.format(df));
		
		zoneId  = ZoneId.of("Asia/Kolkata");
		LocalDateTime timeInIndia= LocalDateTime.now(zoneId);
		System.out.println("Time in India: "+timeInIndia.format(df));
	}

}
