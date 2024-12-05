package com.demo.CRMAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.CRMAssignment.model.BDE;
import com.demo.CRMAssignment.service.BDEService;

@RestController
@RequestMapping("/api/BDE")
public class BDEController {

	@Autowired
	BDEService bdeService;
	
	@PostMapping
	public BDE creatBDE(@RequestBody BDE bde) {
		return bdeService.createBDE(bde);
	}
	
	@GetMapping
	public List<BDE> getAllBDE(){
		return bdeService.getAllBDE();
	}
	
	@GetMapping("/{id}")
	public BDE getBDEById(@PathVariable int id) {
		return bdeService.getBDEById(id);
	}
	
	@PutMapping("/{id}")
	public BDE updateBDE(@PathVariable int id,@RequestBody BDE bde) {
		return bdeService.updateBDE(id, bde);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBDE(@PathVariable int id) {
		bdeService.deleteBDE(id);
	}
}
