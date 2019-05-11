package recurring;

import java.util.Scanner;

public class SumOfDigit 
{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		int a=isSumdigit(no);
		System.out.println(a);
	}
	
	public static int isSumdigit(int no)
	{
		if(no==0)
			return no;
		return (no%10)+isSumdigit(no/10);
	}
	
}
