import java.util.Scanner;

//wap to convert every words of first letter into upper case and remaining into lower case.
public class StringCamelCase 
{
public static void main(String[] args) {
	System.out.println("Enter the words");
	Scanner sc= new Scanner(System.in);
	String str=sc.nextLine();
	char  ch[]=str.toCharArray();
	for (int i = 0; i < ch.length; i++)
	{
		if (i==0 && ch[i]!=' '|| ch[i]!=' ' && ch[i-1]==' ') 
		{
			if (ch[i]>='a'&& ch[i]<='z')
			
				ch[i]=(char)(ch[i]-32);
			
			else 
			{
				if (ch[i]>='A' && ch[i]<='Z')
				
					ch[i]=(char)(ch[i]+32);
				
			}
		
				
//				  str=" "; 
//				  for (int j = 0; j < ch.length; j++)
//				  {
//					  str=str+ch[i];
//				  
//				  }
//				  System.out.println(str);
				 
			str= new String(ch);
	        System.out.println(str);
		}
	}
	
	
	
	
	
	
}
}
