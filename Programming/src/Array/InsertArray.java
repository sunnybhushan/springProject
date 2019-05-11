package Array;

public class InsertArray 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50,60};
		int b[]= new int[a.length+1];
		int position=3;
		int ele=35;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-position-1; j++)
			{
				b[j]=a[j];
			}
			b[3]=ele;
			for (int j =a.length-position-2 ; j < a.length; j++)
			{
				b[j]=a[i];
			}
		}
		for (int i : b) {
			System.out.print(a[i]+" ");
		}
		
		
		
	}
}



