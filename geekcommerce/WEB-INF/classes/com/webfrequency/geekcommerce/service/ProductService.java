package com.webfrequency.geekcommerce.service;

import java.util.List;

import com.webfrequency.geekcommerce.domain.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	Product getProductById(String productId);
	
	List<Product> getProductsByCategory(String category);
}
