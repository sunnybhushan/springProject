package recurring;

public class StringWordRev
{
	public static void main(String[] args) {
		String str="sunny";
		
		
		  StringBuilder st= new StringBuilder(); 
		  st.append(str);
		  st=st.reverse();
		  System.out.println(st);
		 
		System.out.println("----------------------");
		char ch[]=str.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) 
		{
			System.out.print(ch[i]);
		}
		
	}
}
