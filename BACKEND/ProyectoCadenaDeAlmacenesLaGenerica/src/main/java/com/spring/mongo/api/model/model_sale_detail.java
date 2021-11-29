package com.spring.mongo.api.model;

//IMPORT ELEMENT
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
	private long id; // OPERATION NUMBER, CODE, OR ID
	private long sale_invoice_id; // INVOICE NUMBER, CODE OR ID
	private String sale_date;
	private int sale_store_id;
	private long sale_user_id;
	private int sale_customer_id;
	private long sale_product_id;
	private String sale_product_name;
	private double sale_product_price_buy;
	private double sale_product_iva;
	private double sale_product_price_sale;
	private double sale_produc_quantity;
	private double sale_total;
	
	// SET AND GET
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSale_invoice_id() {
		return sale_invoice_id;
	}
	public void setSale_invoice_id(long sale_invoice_id) {
		this.sale_invoice_id = sale_invoice_id;
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
	public long getSale_product_id() {
		return sale_product_id;
	}
	public void setSale_product_id(long sale_product_id) {
		this.sale_product_id = sale_product_id;
	}
	public String getSale_product_name() {
		return sale_product_name;
	}
	public void setSale_product_name(String sale_product_name) {
		this.sale_product_name = sale_product_name;
	}
	public double getSale_product_price_buy() {
		return sale_product_price_buy;
	}
	public void setSale_product_price_buy(double sale_product_price_buy) {
		this.sale_product_price_buy = sale_product_price_buy;
	}
	public double getSale_product_iva() {
		return sale_product_iva;
	}
	public void setSale_product_iva(double sale_product_iva) {
		this.sale_product_iva = sale_product_iva;
	}
	public double getSale_product_price_sale() {
		return sale_product_price_sale;
	}
	public void setSale_product_price_sale(double sale_product_price_sale) {
		this.sale_product_price_sale = sale_product_price_sale;
	}
	public double getSale_produc_quantity() {
		return sale_produc_quantity;
	}
	public void setSale_produc_quantity(double sale_produc_quantity) {
		this.sale_produc_quantity = sale_produc_quantity;
	}
	public double getSale_total() {
		return sale_total;
	}
	public void setSale_total(double sale_total) {
		this.sale_total = sale_total;
	}
	

}
