package com.PastaPizzaOrderingSystem;

import java.util.HashMap;
import java.util.Map;

public class Pizza extends Entity{
	private String size;
	private String crustType;
	//private String flavour;
	public static HashMap<String, Integer> toppings;
	static{
		toppings = new HashMap<String, Integer>();
		toppings.put("Cheese", 1);
		toppings.put("Mushroom", 1);
		toppings.put("Tomato", 1);
		toppings.put("Jalapeno", 1);
		toppings.put("Spinach", 1);
	}
	private int price;
	private HashMap<String, Boolean> selectToppings;
	
	
	
	public HashMap<String, Boolean> getSelectToppings() {
		return selectToppings;
	}
	public void setSelectToppings(HashMap<String, Boolean> selectToppings) {
		this.selectToppings = selectToppings;
	}
	public Pizza(String size, String crustType) {
		super();
		this.size = size;
		this.crustType = crustType;
		//this.flavour = flavour;
		//this.toppings = toppings;
		//this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCrustType() {
		return crustType;
	}
	public void setCrustType(String crustType) {
		this.crustType = crustType;
	}
	/*public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}*/
	public HashMap<String, Integer> getToppings() {
		return toppings;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	

}
