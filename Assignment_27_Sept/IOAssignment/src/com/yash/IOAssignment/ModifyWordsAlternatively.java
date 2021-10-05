package com.yash.IOAssignment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ModifyWordsAlternatively {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Please enter file path to modify");
			String path = sc.nextLine();
			File file = new File(path);
				if(file.exists()) 
				{
					ModifyWordsAlternatively.modifyWordsAlternatively(file);
				}
				else {
					System.out.println("File does not exist");
				}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void modifyWordsAlternatively(File file) throws IOException {
		Path path = file.toPath();
		List<String> readAllLines = Files.readAllLines(path);
		System.out.println("Content in given file path:");
		readAllLines.forEach(System.out::println);
		readAllLines = readAllLines.stream().map(x -> {
			String[] content = x.split(" ");
			StringBuilder builder = new StringBuilder();
			for(int i=0;i<content.length;i++) {
				if(i%2 != 0) {
					String s = content[i];
					builder.append(s.toUpperCase()).append(" ");
				}
				else {
					builder.append(content[i]).append(" ");
				}
			}
			return builder.toString();
		}).collect(Collectors.toList());
		
		Files.write(path, readAllLines, StandardOpenOption.WRITE);
		System.out.println("Words modified alternatively in file successfully");
		System.out.println("Modified content in given file path:");
		readAllLines.forEach(System.out::println);
	}
}