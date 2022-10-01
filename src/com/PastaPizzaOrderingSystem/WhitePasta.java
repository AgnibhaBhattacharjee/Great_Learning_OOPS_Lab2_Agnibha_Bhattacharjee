package com.PastaPizzaOrderingSystem;

public class WhitePasta extends Pasta{
	private String type;
	private int price;
	
	
	public WhitePasta(String type) {
		super(type);
		this.type = type;
		setPrice();
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
		this.price = 10;
	}
	

}
