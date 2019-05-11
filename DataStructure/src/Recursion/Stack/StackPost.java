//wajp to evaluate the post-fix expression.
package Recursion.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackPost
{
	public static void main(String[] args) {
		System.out.println("enter the post fix expression...");
		Scanner sc= new Scanner(System.in);
		String st=sc.nextLine();
		
		Stack<Double> sk= new Stack<Double>();
		
		for (int i = 0; i < st.length(); i++)
		{
			char ch=st.charAt(i);
			if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
			{
				System.out.println("Enter the value of "+ch);
				double v= sc.nextDouble();
				sk.push(v);
			}
			else
			{
				double x=sk.pop();
				double y=sk.pop();
				
				switch (ch)
				{
				case '+': sk.push(y+x);
					break;
					
				case '-': sk.push(y-x);
				break;
				
				case '*': sk.push(y*x);
				break;
				
				case '/': sk.push(y/x);
				break;
				
				case '%': sk.push(y%x);
				break;

				}
						
			}
		}
		System.out.println("Evaluated value is: "+sk.pop());
		
	}
}





