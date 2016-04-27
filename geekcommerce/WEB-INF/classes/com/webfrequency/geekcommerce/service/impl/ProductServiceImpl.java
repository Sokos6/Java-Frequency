package com.webfrequency.geekcommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webfrequency.geekcommerce.domain.Product;
import com.webfrequency.geekcommerce.domain.repository.ProductRepository;
import com.webfrequency.geekcommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	public Product getProductById(String productId) {
		return productRepository.getProductById(productId);
	}
	
	public List<Product> getProductsByCategory(String category) {
		return productRepository.getProductsByCategory(category);
	}
}
