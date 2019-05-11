package Recursion;

import java.util.Scanner;

public class GCD 
{
	public static void main(String[] args) {
		System.out.println("Enter the two number");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		int no1=sc.nextInt();
		sc.close();
		int sum=isgcd(no,no1);
		System.out.println(sum);
	}
	static int isgcd(int m, int n)
	{
		if(n>m)
		return isgcd(n,m);
		
		if(m%n==0)
			return n;
			
		return isgcd(n, m%n);
	}
}
