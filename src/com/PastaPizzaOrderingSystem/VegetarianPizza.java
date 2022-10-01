package com.PastaPizzaOrderingSystem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class VegetarianPizza extends Pizza{
	private String size;
	private String crustType;
	private int price;
	private HashMap<String, Boolean> selectToppings;

	public VegetarianPizza(String size, String crustType) {
		super(size, crustType);
		this.size= size;
		this.crustType= crustType;
		selectToppings= new HashMap<String, Boolean>();
		selectToppings.put("Cheese", false);
		selectToppings.put("Mushroom", false);
		selectToppings.put("Tomato", false);
		selectToppings.put("Jalapeno", false);
		selectToppings.put("Spinach", false);
		setPrice();
		// TODO Auto-generated constructor stub
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

	public int getPrice() {
		return price;
	}

	public void setPrice() {
		int pizzaPrice=20;
		{	if(this.size.equalsIgnoreCase("Small")){
				pizzaPrice=pizzaPrice*1;
			}
			else if(this.size.equalsIgnoreCase("Medium")){
				pizzaPrice=pizzaPrice*2;
			}
			else if(this.size.equalsIgnoreCase("Large")){
				pizzaPrice=pizzaPrice*3;
			}
		}
		Iterator itr1 = selectToppings.entrySet().iterator();
		Iterator itr2 = toppings.entrySet().iterator();
		while(itr1.hasNext() && itr2.hasNext()){
			Map.Entry entry1= (Map.Entry) itr1.next();
			Map.Entry entry2= (Map.Entry) itr2.next();
			if( entry1.getKey().equals(entry2.getKey()) && (boolean) entry1.getValue() ){
				pizzaPrice= pizzaPrice+ (int)entry2.getValue();
			}
		}
		this.price= pizzaPrice;
		
	}

	public HashMap<String, Boolean> getSelectToppings() {
		return selectToppings;
	}

	public void setSelectToppings(HashMap<String, Boolean> selectToppings) {
		this.selectToppings = selectToppings;
		setPrice();
	}
	
	

}
