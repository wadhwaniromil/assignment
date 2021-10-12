package com.yash.FileVisitor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountFiles {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.print("Please enter file extension to search: ");
			String givenExtension = sc.nextLine();
			System.out.print("Please enter path to search in: ");
			String givenPath = sc.nextLine();
			File file = new File(givenPath);
			Visitor visitor = new Visitor(givenExtension);
			
			if (file.isDirectory()) {
				try {
					Path dirPath = Paths.get(givenPath);
					Files.walkFileTree(dirPath, visitor);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Path entered not found!");
			}
			System.out.println("Total number of files- "+(visitor.getCount()));

		}
	}
	
}
