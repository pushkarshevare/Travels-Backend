package com.travels.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travels.project.model.CabBooking;
import com.travels.project.repository.CabBookingRepository;

@RestController
@RequestMapping("/cabBook")
public class CabBookingController {

	@Autowired
	CabBookingRepository cabBookRepo;

	@PostMapping("/submit")
	public ResponseEntity<String> submit(@RequestBody CabBooking cb) {
		
		System.out.println(cb);
		cabBookRepo.save(cb);
		
		return ResponseEntity.ok("Submitted....");
		
	}
	
	@GetMapping("/allCabBooking")
	public ResponseEntity<List<CabBooking>> getAllCabBooking(){
		
		List<CabBooking> allBooking = (List<CabBooking>)cabBookRepo.findAll();
		
		return ResponseEntity.ok(allBooking);
	}
}
