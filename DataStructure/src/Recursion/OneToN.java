package Recursion;

public class OneToN 
{
	public static void main(String[] args) 
	{
		int a=5;
		
		isDisplay(a);
	}

	private static void isDisplay(int a) 
	{
		
		if(a<1)
			System.out.print(a+" ");
		isDisplay(a-1);
		
	}
}
