package stack;

public class MainStack
{
	public static void main(String[] args)
	{
		MyStack sk= new MyStack(8);
		sk.push("Mahesh");
		sk.push("Suresh");
		sk.push("Rajesh");
		System.out.println(sk);
		System.out.println(sk.pop());
		System.out.println(sk);
		System.out.println(sk.size());
		System.out.println(sk.peek());
		
	}
}
