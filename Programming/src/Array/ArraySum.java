package Array;

public class ArraySum 
{
	public static void main(String[] args) {
		int ar[]= {10,20,30,40};
		
		int sum=0;
		int ele=ar[0];
		for (int i = 0; i < ar.length; i++) 
		{
			sum=sum+ar[i];
		}
		System.out.println(sum);
		}
	}




