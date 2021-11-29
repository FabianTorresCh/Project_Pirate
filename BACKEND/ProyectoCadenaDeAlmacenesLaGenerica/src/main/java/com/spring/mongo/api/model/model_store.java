package com.spring.mongo.api.model;

//IMPORT ELEMENT
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Document(collection="collection_store") // NAME COLLECTION

//BODY MODEL
public class model_store {

	// ELEMENT MODEL
	private int id; // STORE ID
	private String store_namefull;
	private String store_city;
	private String store_address;
	private String store_email;
	private int store_phone;
	
	// SET AND GET
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStore_namefull() {
		return store_namefull;
	}
	public void setStore_namefull(String store_namefull) {
		this.store_namefull = store_namefull;
	}
	public String getStore_city() {
		return store_city;
	}
	public void setStore_city(String store_city) {
		this.store_city = store_city;
	}
	public String getStore_address() {
		return store_address;
	}
	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}
	public String getStore_email() {
		return store_email;
	}
	public void setStore_email(String store_email) {
		this.store_email = store_email;
	}
	public int getStore_phone() {
		return store_phone;
	}
	public void setStore_phone(int store_phone) {
		this.store_phone = store_phone;
	}

}
