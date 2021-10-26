package com.yash.student_record;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class StudentRecordOnSemMarks {

	public static void main(String[] args) {
		List<Student> listOfStudents = Student.getStudentList();
		listOfStudents.forEach(s->{
			Map<String, Integer> map = new HashMap<>();
			map.put("Sem1",s.getSemester1Marks());
			map.put("Sem2",s.getSemester2Marks());
			map.put("Sem3",s.getSemester3Marks());
			
			Optional<Entry<String, Integer>> min = map
					.entrySet()
					.stream()
					.min((m1,m2)->m1.getValue().compareTo(m2.getValue()));

			Optional<Entry<String, Integer>> max = map
					.entrySet()
					.stream()
					.max((m1,m2)->m1.getValue().compareTo(m2.getValue()));
			
			System.out.println("Student name: "+s.getFirstName()+" "+s.getLastName());
			System.out.println("Student roll no: "+s.getRollNo());
			if(max.isPresent()) {
				System.out.println("Highest of all sem: "+max.get().getValue() + " in "+max.get().getKey());				
			}
			if(min.isPresent()) {
				System.out.println("Lowest of all sem: "+min.get().getValue() + " in "+min.get().getKey());				
			}
		
		});

	}

}
