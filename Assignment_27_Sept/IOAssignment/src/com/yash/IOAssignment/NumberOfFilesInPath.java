package com.yash.IOAssignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NumberOfFilesInPath {
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter path to count files");
			String path = sc.nextLine();
			File file = new File(path);
			if (file.isDirectory()) {
				System.out.println("Number of files in given path-> " + countNumberOfFilesInGivenPath(file));
			} else {
				System.out.println("Path entered is invalid!");
			}
		}
	}

	public static long countNumberOfFilesInGivenPath(File file){
		long numberOfFileInPath = 0;
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			if(f.isFile()) {
				numberOfFileInPath++;
			}
		}
		return numberOfFileInPath;
	}
}