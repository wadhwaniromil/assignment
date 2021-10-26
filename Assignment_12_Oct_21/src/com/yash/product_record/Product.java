package com.yash.product_record;

import java.util.Arrays;
import java.util.List;

public class Product {

	int productId;
    String productDescription;
    int productType;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Builder builder) {
		// TODO Auto-generated constructor stub
		this.productId = builder.productId;
		this.productDescription = builder.productDescription;
		this.productType = builder.productType;
	}
     
     private static class Builder{
    	 int productId;
         String productDescription;
         int productType;
		
         public Builder() {
			super();
			// TODO Auto-generated constructor stub
		}
         
        public Builder setProductId(int productId) {
        	this.productId = productId;
        	return this;
        }
        
        public Builder setProductDescription(String productDescription) {
        	this.productDescription = productDescription;
        	return this;
        }
        
        public Builder setProductType(int productType) {
        	this.productType = productType;
        	return this;
        }
        
        public Product build() {
        	return new Product(this);
        }
         
     }
     
     public static List<Product> getProductList() {
    	 return Arrays.asList(
    			 new Product.Builder()
    			 .setProductId(801)
    			 .setProductDescription("Cadbury")
    			 .setProductType(9)
    			 .build(),
    			 new Product.Builder()
    			 .setProductId(802)
    			 .setProductDescription("Nestle")
    			 .setProductType(7)
    			 .build()
    			 );
     }

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productDescription=" + productDescription + ", productType="
				+ productType + "]";
	}
}
