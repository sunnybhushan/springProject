import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		
		
		boolean rs=isPrimeNo(no);
		
	}

	private static boolean isPrimeNo(int no)
	{
		for (int i = 0; i <no/2; i++)
		{
		if (no%i==0)
		{
			System.out.println("Number is prime no");
		}	
		}
		
		return false;
	}
}
