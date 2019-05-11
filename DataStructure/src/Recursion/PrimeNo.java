package Recursion;

import java.util.Scanner;

public class PrimeNo 

{
	
	static boolean isPrimeNo(int n, int i)
	{
		if(i>n/2)
			return true;
		
		if(n/2%i==0)
			return false;
		
		return isPrimeNo(n, i+1);
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		sc.close();
		boolean rs=isPrimeNo(no,0);
		if(rs)
			System.out.println(no+" It is a prime no");
		else
			System.out.println(no+"No is not a prime no");
				
	}
}
