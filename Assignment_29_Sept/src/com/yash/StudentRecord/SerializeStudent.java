package com.yash.StudentRecord;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

public class SerializeStudent {
	
	public boolean serializeStudentToResourceFile(List<Student> listOfStudent) {
		
		File file = new File("D:\\Training\\Assignment_29_Sept\\src\\com\\yash\\StudentRecord");
		
		try (
			OutputStream os = new FileOutputStream(file.getAbsolutePath()+"\\student.dat");
			ObjectOutputStream oo = new ObjectOutputStream(os)
			){
			if (!file.isDirectory()) {
				throw new IOException("Given directory not found");
			}
			oo.writeObject(listOfStudent);
			return true;
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return false;
		}
	}
}
