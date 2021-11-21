package com.spring.mongo.api.model;

//IMPORT ELEMENT
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Document(collection="collection_supplier") // NAME COLLECTION

//BODY MODEL
public class model_supplier {

	// ELEMENT MODEL
	private int id;
	private int supplier_nit;
	private int supplier_nit_digit;
	private String supplier_namefull;
	private String supplier_address;
	private String supplier_email;
	private int supplier_phone;
	private String supplier_type;
	
	// SET AND GET
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSupplier_nit() {
		return supplier_nit;
	}
	public void setSupplier_nit(int supplier_nit) {
		this.supplier_nit = supplier_nit;
	}
	public int getSupplier_nit_digit() {
		return supplier_nit_digit;
	}
	public void setSupplier_nit_digit(int supplier_nit_digit) {
		this.supplier_nit_digit = supplier_nit_digit;
	}
	public String getSupplier_namefull() {
		return supplier_namefull;
	}
	public void setSupplier_namefull(String supplier_namefull) {
		this.supplier_namefull = supplier_namefull;
	}
	public String getSupplier_address() {
		return supplier_address;
	}
	public void setSupplier_address(String supplier_address) {
		this.supplier_address = supplier_address;
	}
	public String getSupplier_email() {
		return supplier_email;
	}
	public void setSupplier_email(String supplier_email) {
		this.supplier_email = supplier_email;
	}
	public int getSupplier_phone() {
		return supplier_phone;
	}
	public void setSupplier_phone(int supplier_phone) {
		this.supplier_phone = supplier_phone;
	}
	public String getSupplier_type() {
		return supplier_type;
	}
	public void setSupplier_type(String supplier_type) {
		this.supplier_type = supplier_type;
	}
	
	// SET AND GET
	
	
}
