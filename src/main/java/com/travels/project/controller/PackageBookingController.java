package com.travels.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travels.project.model.PackageBooking;
import com.travels.project.repository.PackageBookingRepository;

@RestController
@RequestMapping("/PkgBook")
public class PackageBookingController {

	@Autowired
	PackageBookingRepository pkgBookRepo;
	
	
	@PostMapping("/submitBookData")
	public ResponseEntity<String> submitBookData(@RequestBody PackageBooking pb){
		
		pkgBookRepo.save(pb);
		
		return ResponseEntity.ok("Submitted..");
		
	}
	
	@GetMapping("/allPackageBookings")
	public ResponseEntity<List<PackageBooking>> allPackageBookings(){
		
		List<PackageBooking> list = (List<PackageBooking>)pkgBookRepo.findAll();
		return ResponseEntity.ok(list);
	}
}
