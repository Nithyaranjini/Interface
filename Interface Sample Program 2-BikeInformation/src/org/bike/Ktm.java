package org.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
	 System.out.println("Ktm bike cost is :1000000");
		
	}

	@Override
	public void speed() {
		System.out.println("Ktm bike speed is :167km/h");}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
		
	}
		
		
	}


