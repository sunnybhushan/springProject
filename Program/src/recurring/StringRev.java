package recurring;

import java.util.Scanner;

public class StringRev 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the sentence");
		Scanner sc= new Scanner(System.in);
		String st=sc.nextLine();
		String a=revWord(st);
		System.out.println(a);
	}
	
	public static String revWord(String st)
	{
		st="";
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				st=st+ch[j];
				j--;
			}
			if(i<ch.length)
				st=st+ch[i];
		}
		
		return st;
	}
}
