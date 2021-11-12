package com.corejava.algorithmAssignment;

import java.util.Scanner;

public class StudentMarkssheet
{
	    public static void main(String args[]) 
	    {   
	        Scanner sc = new Scanner(System.in); 
	        int n;
	        int total=0;
	        double average;
	        
	        System.out.println("Enter the subjects ");
	        n=sc.nextInt();

	        int arr[] = new int[n]; //step3
	       
	        System.out.println("Enter the marks secured in each subject ");  
	        for(int i=0;i<n;i++)  
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	            total=total+arr[i];
	        }
	        System.out.println("The total marks obtained is "+total);
	        
      	    average= (total /n); 
	        System.out.println( "Total Percentage : " +average);                         
	    } 
	    
}

















/*Start
Declare an array.
Declare a total variable there and initialize it to 0
Declare a average variable there and initialize it to 0
Ask the user to initialize the array.
for loop that will calculate the sum and average in an array.
calculate the total
Print the total.
Calculate the average
Print the average
stop
*/
	    
