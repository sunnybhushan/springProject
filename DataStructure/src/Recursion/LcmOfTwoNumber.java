package Recursion;

import java.util.Scanner;

public class LcmOfTwoNumber
{
	static int isLcm(int a, int b)
	{
		int ma=a,mb=b;
		
		while(ma!=mb)
		{
			if(ma<mb)
				ma=ma+a;
			else
				mb=mb+b;
		}
		return ma;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		sc.close();
		int no3=isLcm(no1, no2);
		System.out.println("Lcm of two number is: "+no3);
		
	}
}
