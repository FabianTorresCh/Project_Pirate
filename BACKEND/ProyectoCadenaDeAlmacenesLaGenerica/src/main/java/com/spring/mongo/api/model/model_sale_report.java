package com.spring.mongo.api.model;

//IMPORT ELEMENT
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Document(collection="collection_sale_report") // NAME COLLECTION

//BODY MODEL
public class model_sale_report {

	// ELEMENT MODEL
	private long id; // SALE DETAIL ID (sale_invoice_id)
	private String s_report_sale_date; // // SALE DATE BY SALE DETAIL
	private int s_report_store_id; // STORE ID BY SALE DETAIL
	private long s_report_user_id; // USER ID BY SALE DETAIL
	private int s_report_customer_id; // CUSTOMER ID BY SALE DETAIL
	private double s_report_sale_total; // SALE TOTAL BY SALE DETAIL
	
	// SET AND GET
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getS_report_sale_date() {
		return s_report_sale_date;
	}
	public void setS_report_sale_date(String s_report_sale_date) {
		this.s_report_sale_date = s_report_sale_date;
	}
	public int getS_report_store_id() {
		return s_report_store_id;
	}
	public void setS_report_store_id(int s_report_store_id) {
		this.s_report_store_id = s_report_store_id;
	}
	public long getS_report_user_id() {
		return s_report_user_id;
	}
	public void setS_report_user_id(long s_report_user_id) {
		this.s_report_user_id = s_report_user_id;
	}
	public int getS_report_customer_id() {
		return s_report_customer_id;
	}
	public void setS_report_customer_id(int s_report_customer_id) {
		this.s_report_customer_id = s_report_customer_id;
	}
	public double getS_report_sale_total() {
		return s_report_sale_total;
	}
	public void setS_report_sale_total(double s_report_sale_total) {
		this.s_report_sale_total = s_report_sale_total;
	}
	
	
}
