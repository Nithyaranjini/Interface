package org.emp1;


public class GreensBank extends ICICI {
	
    @Override
	public  void saving() {
    System.out.println("5%");

	}
    @Override
	public  void deposit() {
		System.out.println("7%");
	}
    public static void main(String[]args) {
	GreensBank bank =new GreensBank();
		bank.saving();
		bank.deposit();
		bank.fixed();
		
	}}
		


