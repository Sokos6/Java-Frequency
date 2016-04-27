package com.webfrequency.geekcommerce.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.webfrequency.geekcommerce.domain.Customer;
import com.webfrequency.geekcommerce.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	private List<Customer> listOfCustomers = new ArrayList<Customer>();

	public InMemoryCustomerRepository() {
		Customer cust1 = new Customer();
		cust1.setCustomerId(1);
		cust1.setfName("Will");
		cust1.setlName("Sokolowski");
		cust1.setEmailAddress("will.sokolowski@gmail.com");
		cust1.setPhoneNumber("7576178444");;
		cust1.setNumOfOrdersMade(1);

		listOfCustomers.add(cust1);
	}

	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}

}
