package com.corejava.algorithmAssignment;

public class BubbleSort
{

    public static void main(String args[]) 
    {
    	int[] a={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
    	int temp;
    	for(int i=0; i<a.length;i++) //for rounds
    	{
    		
    		for(int j=0;j<a.length-1;j++)
    		{
    			if(a[j] > a[j+1])    //Swapping
    			{
    				temp=a[j];  
    				a[j]=a[j+1];
    				a[j+1]=temp;
    			}
    		}
    	}
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.print(a[i]+"  ");
    	}
    }
}


