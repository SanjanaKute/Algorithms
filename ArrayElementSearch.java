package com.corejava.algorithmAssignment;
import java.util.Scanner;
public class ArrayElementSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int search;
		int i;
		int n = 0;
		int number = 0;
		int[]a = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

		
		 
		System.out.println("Enter the element to be searched");
		search = sc.nextInt();
	
		for(i=0;i<a.length;i++)
	    {
	        if(a[i]==search)
	        {
	            System.out.println("Element found");
	            break;
	        }
	    }
	
		if(number>0)
	    {
	        System.out.println("Element "+search+" not found");
	    }
	}

}


