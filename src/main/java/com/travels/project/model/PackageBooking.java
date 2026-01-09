package com.travels.project.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="packageBooking")
public class PackageBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pkgbook_id;
	
	private String tripType;
	
	private String carType;
	
	private LocalDate bookDate;
	
	private String customerName;
	
	private String contact;

	public PackageBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

	public PackageBooking(int pkgbook_id, String tripType, String carType, LocalDate bookDate, String customerName,
			String contact) {
		super();
		this.pkgbook_id = pkgbook_id;
		this.tripType = tripType;
		this.carType = carType;
		this.bookDate = bookDate;
		this.customerName = customerName;
		this.contact = contact;
	}





	public int getPkgbook_id() {
		return pkgbook_id;
	}

	public void setPkgbook_id(int pkgbook_id) {
		this.pkgbook_id = pkgbook_id;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	
	public LocalDate getBookDate() {
		return bookDate;
	}

	public void setBookDate(LocalDate bookDate) {
		this.bookDate = bookDate;
	}


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	
	
	
	
}
