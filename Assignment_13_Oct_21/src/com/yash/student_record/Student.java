package com.yash.student_record;

import java.util.Arrays;
import java.util.List;

public class Student {

	int rollNo;
    String firstName;
    String lastName;
    int semester1Marks;
    int semester2Marks;
    int semester3Marks;
    
	public Student(Builder builder) {
		this.rollNo = builder.rollNo;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.semester1Marks = builder.semester1Marks;
		this.semester2Marks = builder.semester2Marks;
		this.semester3Marks = builder.semester3Marks;
	}
 	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSemester1Marks() {
		return semester1Marks;
	}

	public void setSemester1Marks(int semester1Marks) {
		this.semester1Marks = semester1Marks;
	}

	public int getSemester2Marks() {
		return semester2Marks;
	}

	public void setSemester2Marks(int semester2Marks) {
		this.semester2Marks = semester2Marks;
	}

	public int getSemester3Marks() {
		return semester3Marks;
	}

	public void setSemester3Marks(int semester3Marks) {
		this.semester3Marks = semester3Marks;
	}



	public static class Builder{
    	int rollNo;
        String firstName;
        String lastName;
        int semester1Marks;
        int semester2Marks;
        int semester3Marks;
    	
        public Builder setRollNo(int rollNo) {
        	this.rollNo = rollNo;
        	return this;
        }
        
        public Builder setFirstName(String firstName) {
        	this.firstName = firstName;
        	return this;
        }
        
        public Builder setLastName(String lastName) {
        	this.lastName = lastName;
        	return this;
        }
        
        public Builder setSemester1Marks(int sem1Marks) {
        	this.semester1Marks = sem1Marks;
        	return this;
        }
        
        public Builder setSemester2Marks(int sem2Marks) {
        	this.semester2Marks = sem2Marks;
        	return this;
        }
        
        public Builder setSemester3Marks(int sem3Marks) {
        	this.semester3Marks = sem3Marks;
        	return this;
        }
        
        public Student build() {
        	return new Student(this);
        }
    }
    
    public static List<Student> getStudentList(){
    	return Arrays.asList(
    				new Builder()
    				.setRollNo(131)
    				.setFirstName("Ajay")
    				.setLastName("Kumar")
    				.setSemester1Marks(43)
    				.setSemester2Marks(32)
    				.setSemester3Marks(33)
    				.build(),
    				
    				new Builder()
    				.setRollNo(132)
    				.setFirstName("Saif")
    				.setLastName("Khan")
    				.setSemester1Marks(55)
    				.setSemester2Marks(55)
    				.setSemester3Marks(33)
    				.build(),
    				
    				new Builder()
    				.setRollNo(133)
    				.setFirstName("Karan")
    				.setLastName("Sehgal")
    				.setSemester1Marks(23)
    				.setSemester2Marks(33)
    				.setSemester3Marks(21)
    				.build(),
    				
    				new Builder()
    				.setRollNo(134)
    				.setFirstName("Anunay")
    				.setLastName("Sood")
    				.setSemester1Marks(33)
    				.setSemester2Marks(24)
    				.setSemester3Marks(54)
    				.build(),
    				
    				new Builder()
    				.setRollNo(132)
    				.setFirstName("Gaurav")
    				.setLastName("Kapoor")
    				.setSemester1Marks(55)
    				.setSemester2Marks(45)
    				.setSemester3Marks(19)
    				.build()	
    			);
    }

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", semester1Marks="
				+ semester1Marks + ", semester2Marks=" + semester2Marks + ", semester3Marks=" + semester3Marks + "]";
	}
}
