package Recursion;

 public class NtoOne 
 {
 static void print(int n)
 {
	 if(n>1)
		 print(n-1);
	 System.out.print(n+" ");
	 
 }

public static void main(String[] args)
{
	int n=5;
	
	print(n);
	
}
}
