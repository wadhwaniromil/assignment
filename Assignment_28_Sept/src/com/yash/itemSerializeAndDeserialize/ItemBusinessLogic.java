package com.yash.itemSerializeAndDeserialize;

import java.util.ArrayList;
import java.util.List;

public class ItemBusinessLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serializeItems();
		deserializeItems();
	}
	
	private static void serializeItems() {
		Item item1 = new Item();
		item1.setItemId(01);
		item1.setItemDescription("Pen");
		item1.setItemQuantityAvailable(10);
		item1.setItemUnitPrice(7.6);
		item1.setItemDiscountPercentage(2);
		
		Item item2 = new Item();
		item2.setItemId(02);
		item2.setItemDescription("Pencil");
		item2.setItemQuantityAvailable(20);
		item2.setItemUnitPrice(4.8);
		item2.setItemDiscountPercentage(1);
		
		Item item3 = new Item();
		item3.setItemId(03);
		item3.setItemDescription("Paper");
		item3.setItemQuantityAvailable(55);
		item3.setItemUnitPrice(1.5);
		item3.setItemDiscountPercentage(3);
		
		Item item4 = new Item();
		item4.setItemId(04);
		item4.setItemDescription("Sharpner");
		item4.setItemQuantityAvailable(30);
		item4.setItemUnitPrice(2.5);
		item4.setItemDiscountPercentage(1);
		
		List<Item> listOfItems = new ArrayList<Item>();
		
		listOfItems.add(item1);
		listOfItems.add(item2);
		listOfItems.add(item3);
		listOfItems.add(item4);
		
		System.out.println("Initiating Seriailization of list");
		SerializeAndDeserializeItem.seriailizeItemObject(listOfItems);
		System.out.println("Serialization Completed!");
	}


	private static void deserializeItems() {
		System.out.println("Initiating Deseriailization of list");
		SerializeAndDeserializeItem.deseriailizeItemObject();
		System.out.println("Deserialization Completed!");
	}
	
}
