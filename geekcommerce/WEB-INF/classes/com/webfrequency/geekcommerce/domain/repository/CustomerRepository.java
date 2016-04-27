package com.webfrequency.geekcommerce.domain.repository;

import java.util.List;
import com.webfrequency.geekcommerce.domain.Customer;

public interface CustomerRepository {
	
	List <Customer> getAllCustomers();
}
