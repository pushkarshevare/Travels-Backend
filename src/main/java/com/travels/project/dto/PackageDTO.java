package com.travels.project.dto;

import java.util.List;

public class PackageDTO {
	
	private Long id;
	private String title;
    private String details;
    private List<RatesDTO> rates;

    public PackageDTO(Long id,String title, String details, List<RatesDTO> rates) {
    	this.id = id;
        this.title = title;
        this.details = details;
        this.rates = rates;
    }

    
    public Long getId() { return id;}
    public String getTitle() { return title; }
    public String getDetails() { return details; }
    public List<RatesDTO> getRates() { return rates; }

}
