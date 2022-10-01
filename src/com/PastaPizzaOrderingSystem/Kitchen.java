package com.PastaPizzaOrderingSystem;

import java.util.HashMap;

public class Kitchen {
	private String pizzaFlavour;
	private String size;
	private String pizzaCrust;
	private HashMap<String, Boolean> selectToppings;
	private String pastaFlavour;
	private String pastaType;
	
	
	
	public Kitchen(String pizzaFlavour, String size, String pizzaCrust, HashMap<String, Boolean> selectToppings) {
		super();
		this.pizzaFlavour = pizzaFlavour;
		this.size = size;
		this.pizzaCrust = pizzaCrust;
		this.selectToppings = selectToppings;
	}
	
	
	public Kitchen(String pastaFlavour, String pastaType) {
		super();
		this.pastaFlavour = pastaFlavour;
		this.pastaType = pastaType;
	}


	public String getPizzaFlavour() {
		return pizzaFlavour;
	}
	public void setPizzaFlavour(String pizzaFlavour) {
		this.pizzaFlavour = pizzaFlavour;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPizzaCrust() {
		return pizzaCrust;
	}
	public void setPizzaCrust(String pizzaCrust) {
		this.pizzaCrust = pizzaCrust;
	}
	public HashMap<String, Boolean> getSelectToppings() {
		return selectToppings;
	}
	public void setSelectToppings(HashMap<String, Boolean> selectToppings) {
		this.selectToppings = selectToppings;
	}
	public String getPastaFlavour() {
		return pastaFlavour;
	}
	public void setPastaFlavour(String pastaFlavour) {
		this.pastaFlavour = pastaFlavour;
	}
	public String getPastaType() {
		return pastaType;
	}
	public void setPastaType(String pastaType) {
		this.pastaType = pastaType;
	}
	
	public void preparePizza() throws InterruptedException{
		System.out.println(String.format("We have taken your order for %s %s %s Crust Pizza", this.pizzaFlavour,this.size,this.pizzaCrust));
		if(this.pizzaFlavour.equals("veg")){
			VegetarianPizza vegPizza= new VegetarianPizza(this.size, this.pizzaCrust);
			vegPizza.setSelectToppings(this.selectToppings);
			Thread.sleep(2000);
			System.out.println("We are baking the Pizza");
			Thread.sleep(2000);
			System.out.println(String.format("Your %s %s %s Crust Pizza is ready.", this.pizzaFlavour,this.size,this.pizzaCrust));
			System.out.println(String.format("Please pay %s $",vegPizza.getPrice()));
			System.out.println("Thank you for Ordering");
		}
		else if(this.pizzaFlavour.contains("nonveg")){
			NonVegPizza nonVegPizza= new NonVegPizza(this.size, this.pizzaCrust);
			nonVegPizza.setSelectToppings(this.selectToppings);
			Thread.sleep(2000);
			System.out.println("We are baking the Pizza");
			Thread.sleep(2000);
			System.out.println(String.format("Your %s %s %s Crust Pizza is ready.", this.pizzaFlavour,this.size,this.pizzaCrust));
			System.out.println(String.format("Please pay %s $",nonVegPizza.getPrice()));
			System.out.println("Thank you for Ordering");
		}
		else if(this.pizzaFlavour.equals("vegan")){
			VeganPizza veganPizza= new VeganPizza(this.size, this.pizzaCrust);
			veganPizza.setSelectToppings(this.selectToppings);
			Thread.sleep(2000);
			System.out.println("We are baking the Pizza");
			Thread.sleep(2000);
			System.out.println(String.format("Your %s %s %s Crust Pizza is ready.", this.pizzaFlavour,this.size,this.pizzaCrust));
			System.out.println(String.format("Please pay %s $",veganPizza.getPrice()));
			System.out.println("Thank you for Ordering");
		}
	}
	
	public void preparePasta() throws InterruptedException{
		System.out.println(String.format("We have taken your order for %s sauce %s Pasta", this.pastaFlavour,this.pastaType));
		if(this.pastaFlavour.equals("white")){
			Pasta wPasta = new WhitePasta(this.pastaType);
			Thread.sleep(2000);
			System.out.println("We are cooking the pasta");
			Thread.sleep(2000);
			System.out.println(String.format("Your %s sauce %s Pasta is ready.", this.pastaFlavour,this.pastaType));
			System.out.println(String.format("Please pay %s $",wPasta.getPrice()));
			System.out.println("Thank you for Ordering");
		}
		else if(this.pastaFlavour.equals("red")){
			Pasta rPasta = new RedPasta(this.pastaType);
			Thread.sleep(2000);
			System.out.println("We are cooking the pasta");
			Thread.sleep(2000);
			System.out.println(String.format("Your %s sauce %s Pasta is ready.", this.pastaFlavour,this.pastaType));
			System.out.println(String.format("Please pay %s $",rPasta.getPrice()));
			System.out.println("Thank you for Ordering");
		}
	}
	
	
	

}
