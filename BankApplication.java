package com.corejava.algorithmAssignment;
import java.util.Scanner;

public class BankApplication 
{
	public static void main(String[] args) 
	{
		String username="Sanjana";
		String password="sanjana";
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		do
		{
			System.out.println("Enter Username");
			String username1=sc.nextLine();
			System.out.println("Enter Password");
			String password1=sc.nextLine();

		if (username1.equals("Sanjana") && password1.equals("sanjana"))
	    {
				System.out.println("Welcome " +username1);
				return;
	    }
	
		else{
				System.out.println("Access Denied");
				count++;
				
		}
}
		
			while(count<3);
			{
				System.out.println("Contact Admin");
				
		    }
			//break;
		}
		}




