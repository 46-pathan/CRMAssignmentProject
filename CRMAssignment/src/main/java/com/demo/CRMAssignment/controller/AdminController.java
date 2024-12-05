package com.demo.CRMAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.CRMAssignment.model.Admin;
import com.demo.CRMAssignment.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping
	public Admin createAdmin(@RequestBody Admin admin) {
		return adminService.createAdmin(admin);
	}
	
	@GetMapping
	public List<Admin> getAllAdmin(){
		return adminService.getAllAdmin();
	}
	
	@GetMapping("/{id}")
	public Admin getAdminById(@PathVariable int id) {
		return adminService.getAdminById(id);
	}
	
	@PutMapping("/{id}")
	public Admin updateAdmin(@PathVariable int id,@RequestBody Admin admin) {
		return adminService.updateAdmin(id, admin);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAdmin(@PathVariable int id) {
		adminService.deleteAdmin(id);
	}
}
