package com.corejava.algorithmAssignment;

public class ArmStrongRange 
{
	public static void main(String[] args) 
	{
		int num1=100;
		int num2=999;
	
		for(int number=num1+1; number<num2;number++)
		{
			int sum=0;
			int temp=number;
			int res=0;
		
		while(temp!=0)
		{
			temp=temp/10;		
			sum++;
		
		}
		temp=number;
		
		while(temp!=0)
		{
			int raiseTo = temp % 10;
			res+=Math.pow(raiseTo,sum);
			temp=temp/10;
			
		}

		if(res==number)
		{
			System.out.println("The ArmStrong number in range 100 to 999 is "+number);
			//System.out.println(number);
		
		}

		}
		
		
		int principal=153;
		int rate=370;
		int time=371;
		
		double interest=(principal*rate*time)/100;
		System.out.println("Simple Interest of the supplied numbers is "+interest);
		
	
		}
	}

