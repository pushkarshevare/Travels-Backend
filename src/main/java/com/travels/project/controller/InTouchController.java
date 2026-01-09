package com.travels.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travels.project.model.InTouch;
import com.travels.project.repository.InTouchRepository;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/inTouch")
public class InTouchController {

	@Autowired
	InTouchRepository inTouchRepo;
	
	
	@GetMapping("/")
	public List<InTouch> getData(){
		
		List<InTouch> list = (List<InTouch>)inTouchRepo.findAll();
		return list;
	}
	
	@PostMapping("/submit")
	public String submitInTouch(@RequestBody InTouch it) {
		
		System.out.println(it);
		
		inTouchRepo.save(it);
		return "Data Submited....";
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteRecord(@RequestParam int id) {
		
		inTouchRepo.deleteById(id);
		
		return ResponseEntity.ok("Deleted Successfully.....");
		
	}
	
	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAllRecords(){
		
		inTouchRepo.deleteAll();
		
		return ResponseEntity.ok("All Records are Deleted");
		
	}
}
