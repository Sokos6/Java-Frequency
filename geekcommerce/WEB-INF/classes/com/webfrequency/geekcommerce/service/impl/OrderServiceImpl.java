package com.webfrequency.geekcommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webfrequency.geekcommerce.domain.Product;
import com.webfrequency.geekcommerce.domain.repository.ProductRepository;
import com.webfrequency.geekcommerce.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private ProductRepository productRepository;
	
	public void processOrder(String productId, int count) {
		Product productById = productRepository.getProductById(productId);
		
		if(productById.getUnitsInStock() < count) {
			throw new IllegalArgumentException("Out of Stock. Available Units in Stock" + productById.getUnitsInStock());
		}
		
		productById.setUnitsInStock(productById.getUnitsInStock() - count);
	}
}
