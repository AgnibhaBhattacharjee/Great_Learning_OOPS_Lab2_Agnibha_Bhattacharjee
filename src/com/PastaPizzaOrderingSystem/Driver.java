package com.PastaPizzaOrderingSystem;

import java.util.HashMap;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap<String, Boolean> selectToppings= new HashMap<String, Boolean>();
		int choice;
		do{
			
			System.out.println("This is the Pizza and Pasta ordering system");
			System.out.println("What do you want? (Pizza/Pasta)");
			Scanner sc= new Scanner(System.in);
			String input= sc.next().toLowerCase();
			switch(input){
				case "pizza":{
					System.out.println("This is the Pizza menu\n"
							+ "1. Vegetarian 20 USD SMALL, 40 USD MEDIUM, 60 USD LARGE."+
							"\n2. Non-veg 25 USD SMALL, 50 USD MEDIUM, 75 USD LARGE"+
							"\n3. Vegan 15 USD SMALL, 30 USD MEDIUM, 45 USD LARGE");
					System.out.println("what type of Pizza you want?(Veg/NonVeg/Vegan)");
					String pizzaFlavour= sc.next().toLowerCase();
					System.out.println("what size of Pizza you want?(Small/Medium/Large)");
					String pizzaSize= sc.next().toLowerCase();
					System.out.println("what type of Pizza crust you want?(Thick/Thin)");
					String pizzaCrust= sc.next().toLowerCase();
					System.out.println("List of toppings are:\n"
							+"1. Cheese (1.00 USD)\n"
							+"2. Mushroom (1.00 USD)\n"
							+"3. Tomato (1.00 USD)\n"
							+"4. Jalapeno (1.00 USD)\n"
							+"5. Spinach (1.00 USD)");
					System.out.println("Do you want Cheese topping?(Y/N)");
					String Cheese= sc.next().toLowerCase();
					if(Cheese.equals("y")){selectToppings.put("Cheese", true);}
					else{selectToppings.put("Cheese", false);}
					System.out.println("Do you want Mushroom topping?(Y/N)");
					String Mushroom= sc.next().toLowerCase();
					if(Mushroom.equals("y")){selectToppings.put("Mushroom", true);}
					else{selectToppings.put("Mushroom", false);}
					System.out.println("Do you want Tomato topping?(Y/N)");
					String Tomato= sc.next().toLowerCase();
					if(Tomato.equals("y")){selectToppings.put("Tomato", true);}
					else{selectToppings.put("Tomato", false);}
					System.out.println("Do you want Jalapeno topping?(Y/N)");
					String Jalapeno= sc.next().toLowerCase();
					if(Jalapeno.equals("y")){selectToppings.put("Jalapeno", true);}
					else{selectToppings.put("Jalapeno", false);}
					System.out.println("Do you want Spinach topping?(Y/N)");
					String Spinach= sc.next().toLowerCase();
					if(Spinach.equals("y")){selectToppings.put("Spinach", true);}
					else{selectToppings.put("Spinach", false);}
					
					
				PizzaOrderRequest pizzaOrderRequest= new PizzaOrderRequest(pizzaFlavour, pizzaSize, pizzaCrust, selectToppings);
				pizzaOrderRequest.orderPizza();
				break;
			}
			case "pasta":{
				System.out.println("1. White sauce (10 USD)"
							+"\n2. Red sauce (20 USD)");
				System.out.println("what flavour of Pasta you want?(White/Red)");
				String pastaFlavour= sc.next().toLowerCase();
				System.out.println("what type of Pasta you want?(Penne/Ditalini)");
				String pastaType= sc.next().toLowerCase();
				PastaOrderRequest pastaOrderRequest= new PastaOrderRequest(pastaFlavour, pastaType);
				pastaOrderRequest.orderPasta();
				break;
			}
		

	}
	System.out.println("Press 1 to continue 0 to exit");
	choice= sc.nextInt();
		
	}while(choice==1);
}
}


