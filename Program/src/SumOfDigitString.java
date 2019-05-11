import java.util.Scanner;

//wajp to count the sum of digits in the string
public class SumOfDigitString
   {
public static void main(String[] args) 
   {
	Scanner sc= new Scanner(System.in);
	String str= sc.nextLine();
	int sum=0;
	char ch[]=str.toCharArray();
	for (int i = 0; i < ch.length; i++) 
	{
		if (ch[i]>=48 && ch[i]<=57)
		{
			sum=sum+ch[i]-48;
			
		}
		
	
	}
	System.out.println(sum);
}
}
