package com.webfrequency.geekcommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webfrequency.geekcommerce.domain.repository.CustomerRepository;

@Controller



public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	@RequestMapping("/customers")
	public String list(Model model) {
	  model.addAttribute("customers", customerRepository.getAllCustomers());
	  return "customers";
	}
}

