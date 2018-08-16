package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		//Test if the quantity entered is less than
		// or equal to 0 the value assigned to the stock is 0.
		if (quantity <= 0 )
		{
			this.quantity = 0;
		}
		else
		{
			this.quantity = quantity;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		//If the price entered is less than or equal to 0, the value assigned to the price is 0
		// OR if the price is strictly greater than 1000 the value assigned to the price is 0.
		if (price <= 0 || price > 1000)
		{
			this.price = 0;
		}
		else
		{
			this.price = price;
		}

	}

	public double getInventoryPrice() {
		// TODO Auto-generated method stub
		return price*quantity;
	}
}
