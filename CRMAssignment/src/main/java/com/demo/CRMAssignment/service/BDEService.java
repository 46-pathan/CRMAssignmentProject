package com.demo.CRMAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.CRMAssignment.model.BDE;
import com.demo.CRMAssignment.repository.BDERepository;

@Service
public class BDEService {

	@Autowired
	BDERepository bdeRepository;
	
	public BDE createBDE(BDE bde) {
		return bdeRepository.save(bde);
	}
	
	public List<BDE> getAllBDE(){
		return bdeRepository.findAll();
	}
	
	public BDE getBDEById(int id) {
		return bdeRepository.findById(id).orElse(null);
	}
	
	public BDE updateBDE(int id,BDE bde) {
		bde.setId(id);
		return bdeRepository.save(bde);
	}
	
	public void deleteBDE(int id) {
		bdeRepository.deleteById(id);
	}
}
