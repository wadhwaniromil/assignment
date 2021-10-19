package com.yash.SerializeAndDeserializeCategory;

import java.util.List;

public class Product {

	private int productId;
	private String productName;
	private List<Item> listOfItems;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Item> getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(List<Item> listOfItems) {
		this.listOfItems = listOfItems;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", listOfItems=" + listOfItems
				+ "]";
	}
}
