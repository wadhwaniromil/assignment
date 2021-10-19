package com.yash.itemSerializeAndDeserialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

public class SerializeAndDeserializeItem {

	public static boolean seriailizeItemObject(List<Item> listOfItems) {
		
		File file = new File("D:\\Training\\Assignment_28_Sept\\src\\com\\yash\\itemSerializeAndDeserialize");
		
		try(OutputStream os = new FileOutputStream(file.getAbsolutePath()+ "\\items.sez");
			ObjectOutputStream oos = new ObjectOutputStream(os);) 
		{	
			if (!file.isDirectory()) {
				throw new IOException("Path is not a valid directory");
			} 
			oos.writeObject(listOfItems);
			return true;
		} catch (IOException e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static boolean deseriailizeItemObject() {
		
		File file = new File("D:\\Training\\Assignment_28_Sept\\src\\com\\yash\\itemSerializeAndDeserialize");
		
		try(InputStream os = new FileInputStream(file.getAbsolutePath()+ "\\items.sez");
			ObjectInputStream oos = new ObjectInputStream(os);) 
		{	
			if (!file.isDirectory()) {
				throw new IOException("Path is not a valid directory");
			} 
			@SuppressWarnings("unchecked")
			List<Item> ls = (List<Item>) oos.readObject();
			System.out.println("List of items-> " + ls);
			return true;
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
