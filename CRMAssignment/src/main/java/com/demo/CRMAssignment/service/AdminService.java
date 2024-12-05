package com.demo.CRMAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.CRMAssignment.model.Admin;
import com.demo.CRMAssignment.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	public Admin createAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	public List<Admin> getAllAdmin(){
		return adminRepository.findAll();
	}
	
	public Admin getAdminById(int id) {
		return adminRepository.findById(id).orElse(null);
	}
	
	public Admin updateAdmin(int id,Admin admin) {
		admin.setId(id);
		return adminRepository.save(admin);
	}
	
	public void deleteAdmin(int id) {
		adminRepository.deleteById(id);
	}
}
