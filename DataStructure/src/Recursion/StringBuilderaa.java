package Recursion;

import java.util.Scanner;

public class StringBuilderaa
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the sentence:");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		sc.close();
	StringBuilder sbf= new StringBuilder();
		
	sbf.append(str);
	
	sbf=sbf.reverse();
	System.out.println(sbf);
	
		
		
	}
}
