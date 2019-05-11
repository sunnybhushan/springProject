//wajp to insert element into array.
public class StringDate 
{
	public static void main(String[] args) 
	{
		int a[] = { 10, 20, 30, 40, 50 };
		int num1 = 3;
		int number = 35;
		int b[] = new int[a.length + 1];
		int num2 = 0;
		
		for (int i = 0; i < b.length; i++) 
		{
			if (i < num1)
			{
				b[i] = a[num2];
				num2++;
			}
			if (i == num1) 
			{
				b[i] = number;
			}
			if (i > num1) 
			{
				b[i] = a[num2];
				num2++;
			}
			System.out.print(b[i] + " ");

		}
	}
}
