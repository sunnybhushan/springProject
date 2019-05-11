import java.util.Scanner;

//wajp to calculate the sum of Numbers in string.number=48-57
public class SumOfNumbersInString 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number and string");
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		char []ch=str.toCharArray();
		int sum=0;
		for (int i = 0; i < ch.length; i++) {
			
			int n=0;
			while (i<ch.length&& ch[i]>=48 &&ch[i]<=57)
			{
				n=n*10+(ch[i]-48);
				i++;
			}
			sum=sum+n;
		}
		
		System.out.println(sum);
	}
}
