import java.util.Scanner;

public class OccurenceOfCharWithoutCases {

	public static void main(String[] args)
	{
		System.out.println("Enter the sentence1");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		
		
	
		
		int count[]=new int[26];
		
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i]>=65 && ch[i]<=90)
			
				count[ch[i]-65]++;
				
			if (ch[i]>=97 && ch[i]<=122) 
			
				count[ch[i]-97]++;
			
		}
		for (int j = 0; j < count.length; j++)
		{
			if(count[j]!=0)
				System.out.println((char)(j+65)+"==>"+count[j]);
		}
		
		
	}

}





