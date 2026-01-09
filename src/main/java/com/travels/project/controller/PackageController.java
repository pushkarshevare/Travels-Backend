package com.travels.project.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travels.project.dto.PackageDTO;
import com.travels.project.dto.RatesDTO;
import com.travels.project.model.Packages;
import com.travels.project.repository.PackagesRepository;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/package")
public class PackageController {

	@Autowired
	PackagesRepository packageRepo;
	
	@GetMapping("/get")
	public List<PackageDTO> getAllPackage(){
		
		List<Packages> list =(List<Packages>)packageRepo.findAll();
		
		 return list.stream()
	                .map(pkg -> new PackageDTO(
	                		pkg.getId(),
	                        pkg.getTitle(),
	                        pkg.getDetails(),
	                        pkg.getRates().stream()
	                                .map(rate -> new RatesDTO(rate.getSeats(), rate.getPrice()))
	                                .collect(Collectors.toList())
	                ))
	                .collect(Collectors.toList());
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Packages> getPackageById(@PathVariable Long id) {
        Optional<Packages> travelPackage = packageRepo.findById(id);
        return travelPackage
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
    }
	
	
	@PostMapping("/addPackage")
	public ResponseEntity<String> addPackages(@RequestBody Packages pkg){
		
		System.out.println(pkg);
		packageRepo.save(pkg);
		
		return ResponseEntity.ok("Package Add Successfully...");
		
	}
	
	
	
}
