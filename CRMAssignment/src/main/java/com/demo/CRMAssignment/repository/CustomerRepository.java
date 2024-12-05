package com.demo.CRMAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.CRMAssignment.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
