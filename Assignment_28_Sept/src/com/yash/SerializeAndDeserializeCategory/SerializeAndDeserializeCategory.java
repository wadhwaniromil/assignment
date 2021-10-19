package com.yash.SerializeAndDeserializeCategory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.codehaus.jackson.map.ObjectMapper;



public class SerializeAndDeserializeCategory {
	public static boolean serializeCategory(Category category) {
		ObjectMapper mapper=new ObjectMapper();
		try {
			OutputStream os=new FileOutputStream("D:\\Training\\Assignment_28_Sept\\src\\com\\yash\\SerializeAndDeserializeCategory\\category.json");
			mapper.writeValue(os, category);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean deserializeCategory() {

		ObjectMapper mapper=new ObjectMapper();
		InputStream is;
		try {
			is = new FileInputStream("D:\\Training\\Assignment_28_Sept\\src\\com\\yash\\SerializeAndDeserializeCategory\\category.json");
			Category category = mapper.readValue(is, Category.class);
			System.out.println(category);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
}
