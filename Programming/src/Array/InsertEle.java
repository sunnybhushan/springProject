package Array;

public class InsertEle
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60};
		int position=3;
		int ele=34;
		for (int i = a.length-1; i > position-1; i--)
		{
			a[i]=a[i-1];
			
		}
		
		a[position-1]=ele;
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
}
