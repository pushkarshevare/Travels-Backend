package com.travels.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travels.project.model.Cars;
import com.travels.project.repository.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	CarRepository carRepo;
	
	
	@GetMapping("/")
	public List<Cars> getAllCars(){
		
		List <Cars> list = (List<Cars>)carRepo.findAll();
		
		return list;
	}
	
	@GetMapping("/getCar")
	public ResponseEntity<Optional<Cars>> getCar(@RequestParam int id){
		
		
		Optional<Cars> lst = carRepo.findById(id);
		
//		System.out.println(lst);
//		
		return ResponseEntity.ok(lst);
	}
	
	@PostMapping("/addCar")
	public ResponseEntity<String> addCar(@RequestBody Cars car){
		
		System.out.println(car);
		carRepo.save(car);
		
		return ResponseEntity.ok("Submitted...");
	}
	
	
	
}
