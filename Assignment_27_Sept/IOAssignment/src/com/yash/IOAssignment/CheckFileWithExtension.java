package com.yash.IOAssignment;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class CheckFileWithExtension {
	static long numberOfFilesWithGivenExtension = 1;

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter extension to search file with:");
			String ext = sc.next();
			File file = new File("D:\\");
			if (file.isDirectory()) {
				try {
					checkFileWithGivenExtension(file, ext);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("Given path not found");
			}
		}
		
		System.out.println("Total number of files with given extension: "+(numberOfFilesWithGivenExtension-1));
	}

	public static void checkFileWithGivenExtension(File file, String extension) throws IOException {
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			if (f.isDirectory()) {
				if (!f.isHidden()) {
					checkFileWithGivenExtension(f, extension);
				}
			} else if (f.isFile()) {
				if(f.isHidden()) {
					continue;
				}
				if (f.getName().endsWith(extension)) {
					System.out.println(numberOfFilesWithGivenExtension+". "+f.getCanonicalPath() +"  Size of file-> "+Files.size(f.toPath()));
					numberOfFilesWithGivenExtension++;
				}
			}
		}
	}
}