package com.yash.SerializeAndDeserializeCategory;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int categoryId;
	private String categoryName;
	private List<SubCategory> listOfSubCategories;
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<SubCategory> getListOfSubCategories() {
		return listOfSubCategories;
	}

	public void setListOfSubCategories(List<SubCategory> listOfSubCategories) {
		this.listOfSubCategories = listOfSubCategories;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", listOfSubCategories="
				+ listOfSubCategories + "]";
	}
	
}
