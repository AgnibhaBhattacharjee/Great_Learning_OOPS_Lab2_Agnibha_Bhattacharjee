package com.PastaPizzaOrderingSystem;

public class PastaOrderRequest {
	private String pastaFlavour;
	private String pastaType;
	
	
	public PastaOrderRequest(String pastaFlavour, String pastaType) {
		super();
		this.pastaFlavour = pastaFlavour;
		this.pastaType = pastaType;
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
	
	public void orderPasta() throws InterruptedException{
		Kitchen pastaKitchen= new Kitchen(pastaFlavour, pastaType);
		pastaKitchen.preparePasta();
		
		/*System.out.println(String.format("We have taken your order for %s sauce %s Pasta", this.pastaFlavour,this.pastaType));
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
		}*/
	}
	
}
