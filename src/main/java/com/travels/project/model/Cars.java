package com.travels.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cars")
public class Cars {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int car_id;
	
	private String car_name;
	
	private int car_rate;

	private String features;

	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cars(int car_id, String car_name, int car_rate, String features) {
		super();
		this.car_id = car_id;
		this.car_name = car_name;
		this.car_rate = car_rate;
		this.features = features;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
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

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Cars [car_id=" + car_id + ", car_name=" + car_name + ", car_rate=" + car_rate + ", features=" + features
				+ "]";
	}

	
	
	
}
