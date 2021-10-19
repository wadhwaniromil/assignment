package com.yash.SerializeAndDeserializeCategory;

import java.util.Arrays;

public class CategoryBusinessLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serializeCategory();
		deserializeCategory();
	}

	private static void serializeCategory() {
		// TODO Auto-generated method stub
		
		Item item1 = new Item();
		item1.setItemId(01);
		item1.setItemName("Pen");
		item1.setItemPrice(7.6);
		
		Item item2 = new Item();
		item2.setItemId(02);
		item2.setItemName("Pencil");
		item2.setItemPrice(4.8);
			
		Product product1=new Product();
		product1.setProductId(101);
		product1.setProductName("Geometry Box");
		product1.setListOfItems(Arrays.asList(new Item[] {item1,item2}));
		
		Product product2=new Product();
		product2.setProductId(102);
		product2.setProductName("Pencil box");
		product2.setListOfItems(Arrays.asList(new Item[] {item1, item1}));
			
		
		SubCategory subCategory1=new SubCategory();
		subCategory1.setSubCategoryId(981);
		subCategory1.setSubCategoryName("School Box");
		subCategory1.setListOfProducts(Arrays.asList(new Product[] {product2}));
		
		SubCategory subCategory2=new SubCategory();
		subCategory2.setSubCategoryId(882);
		subCategory2.setSubCategoryName("College Box");
		subCategory2.setListOfProducts(Arrays.asList(new Product[] {product1}));
		
		Category category=new Category();
		category.setCategoryId(132);
		category.setCategoryName("Study");
		category.setListOfSubCategories(Arrays.asList(new SubCategory[] {subCategory1, subCategory2}));
		
		System.out.println("Initialized Serialization");
		SerializeAndDeserializeCategory.serializeCategory(category);
		System.out.println("Serialization Completed");
		
	
	}

	private static void deserializeCategory() {
		// TODO Auto-generated method stub
		System.out.println("Initialized Deserialization");
		SerializeAndDeserializeCategory.deserializeCategory();
		System.out.println("Deserialization Completed");
		
	}

}
