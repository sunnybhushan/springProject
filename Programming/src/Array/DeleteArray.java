package Array;

public class DeleteArray
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		int ele=10;
		
		for (int i = 0; i < a.length; i++) 
		{
			if (ele==a[i])
			{
				for (int j = i; j < a.length-1; j++)
				{
					a[j]=a[j+1];
				}
				break;
			}
			
		}
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("hh");
	}
}
