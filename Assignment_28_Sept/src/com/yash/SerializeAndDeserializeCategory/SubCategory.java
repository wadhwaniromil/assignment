package com.yash.SerializeAndDeserializeCategory;

import java.util.List;

public class SubCategory {

	private int subCategoryId;
	private String subCategoryName;
	private List<Product> listOfProducts;
	
	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public List<Product> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(List<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName
				+ ", listOfProducts=" + listOfProducts + "]";
	}
		
}
