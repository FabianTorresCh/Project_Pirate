package com.spring.mongo.api.model;

//BODY MODEL
public class model_sale_operation {

	// ELEMENT MODEL
	private long sale_product_id; // PRODUCT ID
	private String sale_product_name; // PRODUCT NAME FULL
	private double sale_product_price_buy; // PRODUCT PRICE BUY
	private double sale_product_iva; // IVA
	private double sale_product_price_sale; // PRODUCT PRICE SALE
	private double sale_produc_quantity; // QUANTITY PRODUCT
	
	// CONSTRUCTOR 
	public model_sale_operation(
			long sale_product_id,
			String sale_product_name,
			double sale_product_price_buy,
			double sale_product_iva,
			double sale_product_price_sale,
			double sale_produc_quantity) {
				this.sale_product_id = sale_product_id;
				this.sale_product_name = sale_product_name;
				this.sale_product_price_buy = sale_product_price_buy;
				this.sale_product_iva = sale_product_iva;
				this.sale_product_price_sale = sale_product_price_sale;
				this.sale_produc_quantity = sale_produc_quantity;
			}
	// CONSTRUCTOR DEFAULT
	public model_sale_operation() {}
	
	// SET AND GET
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
	
	
	
	
}
