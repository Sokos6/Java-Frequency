package com.webfrequency.geekcommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webfrequency.geekcommerce.domain.repository.ProductRepository;
import com.webfrequency.geekcommerce.service.ProductService;

@Controller

@RequestMapping("/products")


public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping
	public String list(Model model) {
	  model.addAttribute("products", productService.getAllProducts());
	  
	  return "products";
	}
	
	@RequestMapping("/all")
	public String allProducts(Model model) {
	  model.addAttribute("products", productService.getAllProducts());
	  
	return "products";
	}
	
	@RequestMapping("/{category}")
	public String getProductsByCategory(Model model, @PathVariable("category") String productCategory) {
	  model.addAttribute("products", productService.getProductsByCategory(productCategory));
	  return "products";
	}
}

