package com.PastaPizzaOrderingSystem;

public class RedPasta extends Pasta{
	private String type;
	private int price;
	

	public RedPasta(String type) {
		super(type);
		this.type=type;
		setPrice();
		// TODO Auto-generated constructor stub
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice() {
		this.price=20;
	}
	
	

}
