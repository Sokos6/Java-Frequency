package com.webfrequency.geekcommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfrequency.geekcommerce.domain.Customer;
import com.webfrequency.geekcommerce.domain.repository.CustomerRepository;
import com.webfrequency.geekcommerce.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Autowired
	private CustomerRepository customerRepository;

}
