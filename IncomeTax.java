package com.corejava.algorithmAssignment;

import java.util.Scanner;

public class IncomeTax 
{
	public static void main(String[] args) 
	{
		double taxcharges=0;
		double income;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income ");
		income=sc.nextDouble();
		
		if(income<=180000)
		taxcharges=0;

		else if(income<=300000)
		taxcharges=0.1*(income-250000);
		
		else if(income<=500000)
		taxcharges=0.2*(income-250000);
		
		else if(income<=1000000)
		taxcharges=250000+0.3*(income-250000);
		
		else
		taxcharges=112500+0.4*(income-100000);
	
		System.out.println("Income tax amount is "+taxcharges);
	}

}
