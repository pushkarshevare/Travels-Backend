package com.travels.project.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Packages {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private String title;
    
    @Column(length = 1000)
    private String details;

    @OneToMany(mappedBy = "packages", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Rate> rates;

    
    
	public Packages() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Packages(Long id, String title, String details, List<Rate> rates) {
		super();
		this.id = id;
		this.title = title;
		this.details = details;
		this.rates = rates;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public List<Rate> getRates() {
		return rates;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}
    
    
}
