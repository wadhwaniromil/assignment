package com.yash.StringModify;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StringListCharacterManipulate {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<String> nameList = new ArrayList<>();
			System.out.println("Enter five names:");
			for (int i = 0; i < 5; i++) {
				System.out.print("Enter "+(i+1)+" Name:");
				nameList.add(sc.nextLine());
			}
			System.out.println("<<<<< Five names entered are>>>>>");
			System.out.println(nameList);
			
			modifyThirdCharacter(nameList);
		}
	}
	
	public static void modifyThirdCharacter(List<String> list) {
		Iterator<String> itr=list.iterator();
		List<String> modifiedList = new ArrayList<>();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.length()<3) {
				modifiedList.add(str);
				continue;
			}
			char[] characterArray = str.toCharArray();
			characterArray[2] = Character.toUpperCase(characterArray[2]);
			modifiedList.add(new String(characterArray));
		}

		System.out.println("<<<<< Third character modified in all names");
		System.out.println(modifiedList);
	}
}