package com.demo.CRMAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.CRMAssignment.model.Customer;
import com.demo.CRMAssignment.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
	
	@GetMapping
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	
	@PutMapping("/{id}")
	public Customer updateCustomer(@PathVariable int id,@RequestBody Customer customer) {
		return customerService.updateCustomer(id, customer);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}
}
