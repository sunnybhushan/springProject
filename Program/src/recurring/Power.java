package recurring;

import java.util.Scanner;

public class Power 
{
	 public static void main(String[] args) 
	 {
		 System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println("Enter the power");
		int pwd=sc.nextInt();
		sc.close();
		int  a=isPower(no,pwd);
		System.out.println(a);
	}

	public static int isPower(int no, int pw)
	{
		if(pw==0)
			return 1;
		
		return no*isPower(no, pw-1);
	}
}
