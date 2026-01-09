package com.travels.project.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CabBooking")
public class CabBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cabBookingId;
	
	private String car_name;
	
	private int car_rate;
	
	private LocalDate bookDate;
	
	private LocalTime bookTime;
	
	private String customerName;
	
	private String contact;

	public CabBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CabBooking(int cabBookingId, String car_name, int car_rate, LocalDate bookDate, LocalTime bookTime,
			String customerName, String contact) {
		super();
		this.cabBookingId = cabBookingId;
		this.car_name = car_name;
		this.car_rate = car_rate;
		this.bookDate = bookDate;
		this.bookTime = bookTime;
		this.customerName = customerName;
		this.contact = contact;
	}

	public int getCabBookingId() {
		return cabBookingId;
	}

	public void setCabBookingId(int cabBookingId) {
		this.cabBookingId = cabBookingId;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public int getCar_rate() {
		return car_rate;
	}

	public void setCar_rate(int car_rate) {
		this.car_rate = car_rate;
	}

	public LocalDate getBookDate() {
		return bookDate;
	}

	public void setBookDate(LocalDate bookDate) {
		this.bookDate = bookDate;
	}

	public LocalTime getBookTime() {
		return bookTime;
	}

	public void setBookTime(LocalTime bookTime) {
		this.bookTime = bookTime;
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

	@Override
	public String toString() {
		return "CabBooking [cabBookingId=" + cabBookingId + ", car_name=" + car_name + ", car_rate=" + car_rate
				+ ", bookDate=" + bookDate + ", bookTime=" + bookTime + ", customerName=" + customerName + ", contact="
				+ contact + "]";
	}
	
	
	
}
