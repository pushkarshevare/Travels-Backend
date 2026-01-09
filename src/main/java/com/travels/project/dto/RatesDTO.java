package com.travels.project.dto;

public class RatesDTO {
	
    private String seats;
    private String price;

    public RatesDTO(String seats, String price) {
        this.seats = seats;
        this.price = price;
    }

    public String getSeats() { return seats; }
    public String getPrice() { return price; }

}
