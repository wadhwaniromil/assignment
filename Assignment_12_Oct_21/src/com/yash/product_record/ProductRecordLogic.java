package com.yash.product_record;

import java.util.List;

public class ProductRecordLogic {

	public static void main(String[] args) {
		List<Product> product = Product.getProductList();
		product.forEach(System.out::println);
	}

}
