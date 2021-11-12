package com.corejava.algorithmAssignment;

public class StudentRecord {

	public static void main(String[] args) 
	{
		int marathi=70;
		int english=80;
		int math=90;
	
		if(marathi>=60 && english>=60 && math>=60)
		{
			System.out.println("Passed");
		}
		else if(marathi>=60 && english>=60 && math<=60)
		{
			System.out.println("Promoted");
		}
		else if(marathi>=60 && english<=60 && math<=60)
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Invalid");
			
		}
	}

}
