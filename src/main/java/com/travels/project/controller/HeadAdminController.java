package com.travels.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.travels.project.model.Head_Admin;
import com.travels.project.repository.HeadAdminRepository;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/admin")
public class HeadAdminController {

	@Autowired
	HeadAdminRepository adminRepo;
	
	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody Head_Admin admin){
		
		List<Head_Admin> list = (List<Head_Admin>)adminRepo.findAll();
		
		System.out.println(admin);
		for(Head_Admin ha : list) {
			
			if(ha.getUsername().equals(admin.getUsername()) && ha.getA_password().equals(admin.getA_password())) {
	
				Map<String, Object> response = new HashMap<>();
				response.put("message", "Login Successfully");
				
				
				return ResponseEntity.ok(response);				
			}
		}
		Map<String, Object> errorResponse = new HashMap<>();
		errorResponse.put("message", "Invalid Credentials");
		
		return ResponseEntity.status(401).body(errorResponse);
		
	}
}
