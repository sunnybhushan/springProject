package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class Inputa
{
	public static void main(String[] args)
	{
		FileInputStream fin=null;
		int i;
		
		try 
		{
			fin= new FileInputStream("D:/file.txt");
			System.out.println("Number of charactr -"+fin.available());
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
				
				
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		try 
		{
			fin.close();
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}
		
	}
}
