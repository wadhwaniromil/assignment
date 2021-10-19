package com.yash.SerializeAndDeserializeEmployee;

public class EmployeeBusinessLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serializeEmployee();
		deserializeEmployee();
		
	}

	private static void serializeEmployee() {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		manager.setEmpId(01);
		manager.setEmpFirstName("Ajay");
		manager.setEmpLastName("Kumar");
		manager.setEmpDOB("10 June 1993");
		manager.setEmpGender("Male");
		manager.setManagerId(1101);
		System.out.println("Initiating Serialization");
		SerializeAndDeserializeEmployee.seriailizeEmployeeObject(manager);
		System.out.println("Serialization Completed");
	}

	private static void deserializeEmployee() {
		// TODO Auto-generated method stub

		System.out.println("Initiating Deserialization");
		SerializeAndDeserializeEmployee.deseriailizeEmployeeObject();
		System.out.println("Deserialization Completed");
		
	}

}
