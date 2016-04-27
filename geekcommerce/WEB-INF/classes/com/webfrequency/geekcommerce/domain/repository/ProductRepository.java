package com.webfrequency.geekcommerce.domain.repository;

import java.util.List;
import com.webfrequency.geekcommerce.domain.Product;

public interface ProductRepository {

	List <Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
	
	Product getProductById(String productId);
}
