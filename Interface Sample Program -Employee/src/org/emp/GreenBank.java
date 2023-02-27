package org.emp;

public class GreenBank implements ICICI {

	@Override
	public void saving() {
		System.out.println("Saving percentage is :7%");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit percentage is :9%");}
	@Override
	public void fixed() {
		System.out.println("Fixed percentage is :10%");}
		
	public static void main(String[] args) {
		GreenBank c = new GreenBank();
		c.saving();
		c.deposit();
		c.fixed();
	}}
		
		
	


