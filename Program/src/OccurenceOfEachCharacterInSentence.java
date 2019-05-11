import java.util.Scanner;

public class OccurenceOfEachCharacterInSentence 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the sentence");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int count[]= new int[128];
		
		for (int i = 0; i < ch.length; i++)
		{
			count[ch[i]]++;
		}
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]!=0)
				System.out.println((char)i+"==>"+count[i]);
		}
	}

}


