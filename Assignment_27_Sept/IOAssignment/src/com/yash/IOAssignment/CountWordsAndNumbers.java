package com.yash.IOAssignment;

import java.io.File;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CountWordsAndNumbers {
	public static void main(String[] args) throws IOException{
        StreamTokenizer sTokens = getTokensToCount();
        if(sTokens == null) {
        	System.exit(0);
        }
        
        int tokenNumber = 0;
        int numberOfWords=0, numberOfDigits = 0;
        
        while((tokenNumber = sTokens.nextToken()) != StreamTokenizer.TT_EOF){
            switch(tokenNumber){
                case StreamTokenizer.TT_NUMBER:
                    numberOfDigits++;
                    break;
                case StreamTokenizer.TT_WORD:
                    numberOfWords++;
                    break;
                default:
                    break;
            }
        }
        	System.out.println("\nNumber of words: "+numberOfWords);
        	System.out.println("Numberof digits: "+numberOfDigits);
        }
    
    public static StreamTokenizer getTokensToCount()
    {
    	StreamTokenizer sTokenizer = null;
    	try(Scanner sc = new Scanner(System.in))
    	{
    		System.out.println("Please enter file path to read:");
    		String path = sc.nextLine();
    		File file = new File(path);
    		if(file.exists()) {
        		Path fPath = file.toPath();
        		System.out.println("Content in file-> ");
        		Files.readAllLines(fPath).forEach(System.out::println);
        		
        		sTokenizer = new StreamTokenizer(Files.newBufferedReader(fPath));
        		sTokenizer.eolIsSignificant(true);
        		return sTokenizer;
    		}
    		else {
    			System.out.println("File does not exist");
    		}
    	} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	return sTokenizer;
    }
}
