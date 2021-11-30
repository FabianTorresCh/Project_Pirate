package com.spring.mongo.api.model;

//IMPORT ELEMENT
import java.util.ArrayList;
import com.spring.mongo.api.model.model_sale_operation;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Document(collection="collection_sale_detail") // NAME COLLECTION

//BODY MODEL
public class model_sale_detail {
	
	// ELEMENT MODEL
	private long id; // INVOICE NUMBER, CODE OR ID
	private String sale_date;
	private int sale_store_id;
	private long sale_user_id;
	private int sale_customer_id;
	private ArrayList<model_sale_operation> list_sale_operation = new ArrayList <model_sale_operation>();
	private double sale_total;
	
	// SET AND GET
	public ArrayList<model_sale_operation> getList_sale_operation() {
		return list_sale_operation;
	}
	public void setList_sale_operation(ArrayList<model_sale_operation> list_sale_operation) {
		this.list_sale_operation = list_sale_operation;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSale_date() {
		return sale_date;
	}
	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}
	public int getSale_store_id() {
		return sale_store_id;
	}
	public void setSale_store_id(int sale_store_id) {
		this.sale_store_id = sale_store_id;
	}
	public long getSale_user_id() {
		return sale_user_id;
	}
	public void setSale_user_id(long sale_user_id) {
		this.sale_user_id = sale_user_id;
	}
	public int getSale_customer_id() {
		return sale_customer_id;
	}
	public void setSale_customer_id(int sale_customer_id) {
		this.sale_customer_id = sale_customer_id;
	}
	public double getSale_total() {
		return sale_total;
	}
	public void setSale_total(double sale_total) {
		this.sale_total = sale_total;
	}
	

}
