package com.yash.SerializeAndDeserializeEmployee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

public class SerializeAndDeserializeEmployee {

	public static boolean seriailizeEmployeeObject(Employee employee) {
		
		File file = new File("D:\\Training\\Assignment_28_Sept\\src\\com\\yash\\SerializeAndDeserializeEmployee");
		
		try(OutputStream os = new FileOutputStream(file.getAbsolutePath()+ "\\employee.sez");
			ObjectOutputStream oos = new ObjectOutputStream(os);) 
		{	
			if (!file.isDirectory()) {
				throw new IOException("Path is not a valid directory");
			} 
			oos.writeObject(employee);
			return true;
		} catch (IOException e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static boolean deseriailizeEmployeeObject() {
		
		File file = new File("D:\\Training\\Assignment_28_Sept\\src\\com\\yash\\SerializeAndDeserializeEmployee");
		
		try(InputStream os = new FileInputStream(file.getAbsolutePath()+ "\\employee.sez");
			ObjectInputStream oos = new ObjectInputStream(os);) 
		{	
			if (!file.isDirectory()) {
				throw new IOException("Path is not a valid directory");
			} 
			Employee emp = (Employee) oos.readObject();
			System.out.println("Manager Details-> " + emp);
			System.out.println("Manager Details-> " + emp.getEmpId());
			System.out.println("Manager Details-> " + emp.getEmpFirstName());
			System.out.println("Manager Details-> " + emp.getEmpLastName());
			System.out.println("Manager Details-> " + emp.getEmpDOB());
			System.out.println("Manager Details-> " + emp.getEmpGender());
			return true;
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
