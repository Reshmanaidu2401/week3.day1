package org.system;

public class AxisBank extends BankInfo {
	
	public void deposit(int a) {
		
		System.out.println("Deposit the second amount");
	}
	
	public static void main(String[] args) {
		
		AxisBank axis=new AxisBank();
		
	    axis.deposit(1000);
	   
	    
		
	}

}
