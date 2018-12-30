package edu.ptit.model;

import java.io.Serializable;

public class Item implements Serializable{
	
	private static final long serialVersionUID = 6834900394042478703L;
	private int id;
	private Product product;
	private int quantity;
	private double price;

	public Item() {
		super();
	}
	
	public Item(int id, Product product, int quantity, double price) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", product=" + product + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
