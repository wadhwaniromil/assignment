package com.yash.IOAssignment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ModifyStringInFile {

	private static int index = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file path to read");
		String path = sc.nextLine();
		File file = new File(path);
		if (file.exists() && file.isFile()) {
			System.out.print("Enter a Word to search in file:");
			String search = sc.next();
			
			Path filePath = file.toPath();

			try {
				List<String> readAllLines = Files.readAllLines(filePath);
			
				readAllLines.forEach(x-> {
					index = x.indexOf(search);
				});
				if(index == -1) {
					System.out.println("<<<<< Entered word is not present in file>>>>>");
					return;
				}
				
				System.out.print("Enter word to replace with:");
				String replacement = sc.next();
				
				readAllLines=readAllLines.stream().map(f -> f.replaceAll(search,replacement)).collect(Collectors.toList());
				Files.write(filePath, readAllLines,StandardOpenOption.WRITE);
				System.out.println("Word replaced successfully");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("File not found!");
		}
	}
}
