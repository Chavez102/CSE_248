package p1;

import java.util.Scanner;

public class Calculator {
	private Scanner input;
	private double amount;
	
	public Calculator(double amount) {
		this.amount=amount;
		input=new Scanner(System.in);
		
	}
	
	
	
	public void time(double multiplier)
	{
		amount *=multiplier;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String roundAmount(double d) {
		return String.format("%,.2f", d);
	}
	
	
	public void divide(double denominator) {
		if(denominatorIsZero(denominator)) {
			denominator=getNewDenominator();
		}
		amount/=denominator;
	}

	public double getNewDenominator() {
		double denominator =0;
		while(denominator==0)
		{
			System.out.println("Enter a new denominator");
			denominator= input.nextDouble();
		}
		return 0;
	}

	public boolean denominatorIsZero(double denominator) {
//		if(denominator==0) {
//				return true;
//		}else {
//		return false;
//		}
//SIMPLER than above codes		
		return denominator==0.0;
	}
	
	
	
	
	
	
	
	
	
	

}
