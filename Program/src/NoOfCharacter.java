import java.util.Scanner;

public class NoOfCharacter {

	public static void main(String[] args) 
	{
		System.out.println("Enter the sentence");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				String w="";
				while(i<ch.length && ch[i]!=' ')
				{
					w=w+ch[i];
					i++;
				}
				System.out.println(w+"=>"+w.length());
			}
		}
		
	}

}
