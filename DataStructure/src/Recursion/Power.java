package Recursion;

import java.util.Scanner;

public class Power
{
	static int pow(int n, int p)
	{
		if(p==0)
			return 1;
		
		return n*pow(n, p-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println("Enter the power of number");
		int p=sc.nextInt();
		sc.close();
		int sum=pow(no,p);
		System.out.println(sum);
	}
}
