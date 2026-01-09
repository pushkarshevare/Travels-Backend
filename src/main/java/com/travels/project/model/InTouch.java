package com.travels.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "intouch")
public class InTouch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int it_id;
	
	private String customer_name;
	
	private String customer_email;
	
	private String in_touch_subject;
	
	private String in_touch_message;

	public InTouch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InTouch(int it_id, String customer_name, String customer_email, String in_touch_subject,
			String in_touch_message) {
		super();
		this.it_id = it_id;
		this.customer_name = customer_name;
		this.customer_email = customer_email;
		this.in_touch_subject = in_touch_subject;
		this.in_touch_message = in_touch_message;
	}

	public int getIt_id() {
		return it_id;
	}

	public void setIt_id(int it_id) {
		this.it_id = it_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getIn_touch_subject() {
		return in_touch_subject;
	}

	public void setIn_touch_subject(String in_touch_subject) {
		this.in_touch_subject = in_touch_subject;
	}

	public String getIn_touch_message() {
		return in_touch_message;
	}

	public void setIn_touch_message(String in_touch_message) {
		this.in_touch_message = in_touch_message;
	}

	@Override
	public String toString() {
		return "InTouch [it_id=" + it_id + ", customer_name=" + customer_name + ", customer_email=" + customer_email
				+ ", in_touch_subject=" + in_touch_subject + ", in_touch_message=" + in_touch_message + "]";
	}

	
	
	
}
