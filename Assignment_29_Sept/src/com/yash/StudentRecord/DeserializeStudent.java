package com.yash.StudentRecord;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializeStudent {

	private static double sum=0.0;
	
	public List<Student> deserializeStudentObject()
	{

		File file = new File("D:\\Training\\Assignment_29_Sept\\src\\com\\yash\\StudentRecord");
		
		try(
			InputStream is = new FileInputStream(file.getAbsoluteFile()+"\\student.dat");
			ObjectInputStream ois = new ObjectInputStream(is);
			){
				if(!file.isDirectory()) {
					throw new IOException("Directory does not exist");
				}
	
				List<Student> studentListFromRecord = new ArrayList<>();
				@SuppressWarnings("unchecked")
				List<Student> lists = (List<Student>)ois.readObject();
				for (Student studentFromRecord : lists) {
					Student studnet = new Student();
					studnet.setStudentRollNo(studentFromRecord.getStudentRollNo());
					studnet.setStudentname(studentFromRecord.getStudentname());
					studnet.setSem1Marks(studentFromRecord.getSem1Marks());
					studnet.setSem2Marks(studentFromRecord.getSem2Marks());
					studnet.setSem3Marks(studentFromRecord.getSem3Marks());
					
					studentListFromRecord.add(studnet);
				}
				
				return studentListFromRecord;
		}
		catch(IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
}
