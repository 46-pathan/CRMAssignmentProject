package com.demo.CRMAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.CRMAssignment.model.Customer;
import com.demo.CRMAssignment.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).orElse(null);
	}
	
	public Customer updateCustomer(int id,Customer customer) {
		customer.setId(id);
		return customerRepository.save(customer);
	}
	
	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}
}
