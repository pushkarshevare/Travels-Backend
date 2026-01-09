package com.travels.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travels.project.model.Head_Admin;
import com.travels.project.repository.HeadAdminRepository;

@RestController
public class MainController {
	
	
	

	@Autowired
	HeadAdminRepository headAdminRepo;
	
	@GetMapping("/")
	public ResponseEntity<List<Head_Admin>> get() {
		
		
		List <Head_Admin> list = (List<Head_Admin>) headAdminRepo.findAll();
		
		if (list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	
	@PostMapping("/")
	public String submitHead_Admin(@RequestBody Head_Admin ha) {
		
//		Head_Admin Head_Admin = new Head_Admin();
//		Head_Admin.setUsername("Kunal");
//		Head_Admin.setA_password("Kunal07");
//		
		
		headAdminRepo.save(ha);
		
		return "Submitted....";
		
	}
	
	@DeleteMapping("/delete")
	public String deleteAlHead_Admin() {
		headAdminRepo.deleteAll();
		
		return "Deleted....";
	}
	
	@PutMapping("/update")
	public String update() {
		
		
		Optional<Head_Admin> option = headAdminRepo.findById(102);
		
		Head_Admin ad = option.get();
		
		ad.setUsername("Kunal");
		ad.setA_password("Kunal07");
		
		headAdminRepo.save(ad);
		
		return "Updated....";
		
	}
}
