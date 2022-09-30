package com.greatlearning.library.service;

import java.util.List;

import com.greatlearning.library.entity.Customer;

public interface CustomerService {

	public List<Customer> findAll();
	public Customer findByID(int customerId);
	public void save(Customer theCustomer);
	public void deleteById(int customerId);
}
