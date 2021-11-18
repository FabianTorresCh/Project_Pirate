package com.spring.mongo.api.model;

// IMPORT ELEMENT
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="collection_customer")

// BODY MODEL
public class model_customer {

	// ELEMENT MODEL
	private long customer_id;
	private String customer_namefull;
	private String customer_address;
	private int customer_phone;
	private String customer_email;
	
	// SET AND GET
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_namefull() {
		return customer_namefull;
	}
	public void setCustomer_namefull(String customer_namefull) {
		this.customer_namefull = customer_namefull;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public int getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(int customer_phone) {
		this.customer_phone = customer_phone;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	
	
	
}
