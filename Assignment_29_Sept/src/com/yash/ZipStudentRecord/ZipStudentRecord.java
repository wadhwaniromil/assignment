package com.yash.ZipStudentRecord;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStudentRecord {
	
	public static void main(String[] args) {
	
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Please enter path to store zip file: ");
			String path=sc.nextLine();
			System.out.println("Please enter zip file name: ");
			String name=sc.nextLine();
			File file = new File(path);
			if(!file.isDirectory()) {
				System.out.println("Entered path not found!");
			}
			try(
				InputStream is = new FileInputStream("src\\com\\yash\\StudentRecord\\student.dat");
				OutputStream os = new FileOutputStream(file.getPath()+"\\"+name+".zip");
				ZipOutputStream zos=new ZipOutputStream(os);
				){
				ZipEntry zipEntry=new ZipEntry("student1.dat");
				zos.putNextEntry(zipEntry);
				byte[] buffer=new byte[1024];
				int z;
				while((z=is.read(buffer))>0) {
					zos.write(buffer,0,z);
				}
				zos.closeEntry();
				System.out.println("ZIP file created successfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
			sc.close();
		}
	}
}
