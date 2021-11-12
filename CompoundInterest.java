package com.corejava.algorithmAssignment;

public class CompoundInterest {

	public static void main(String[] args) 
	{
		int principal=1000;
		int rate=2;
		double time=15;
		double CompountInterest = principal*Math.pow(1.0+rate/100.0,time)-principal;
		System.out.println(CompountInterest);
		
	}

}
