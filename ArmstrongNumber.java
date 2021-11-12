package com.corejava.algorithmAssignment;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num=153;
		int sum=0;
		int temp=num;
		int count=countDigits(num);
		
		while(num!=0)
		{
			int digit=num%10;
			int p=power(digit,count);
			sum=sum+p;
			num=num/10;		
		}
		if(temp==sum)
		{
			System.out.println("Number is ArmStrong ");
		}
		else
		{
			System.out.println("Number is not ArmStrong");
		}
	}
	private static int countDigits(int num) 
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		
		return count;
	}

	private static int power(int num, int raiseTo) 
	{
		int res=1;
		for(int i=1;i<=raiseTo;i++)
		{
			res=res*num;
		}
		return res;
	}

}