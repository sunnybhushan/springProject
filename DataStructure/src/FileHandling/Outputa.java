package FileHandling;
import java.io.FileOutputStream;
import java.io.IOException;

public class Outputa 
{
	public static void main(String[] args)
	{
		FileOutputStream fout= null;
		String st="Welcome to Jspider this is not a java";
		
		try {
			fout= new FileOutputStream("D:/file.txt");
			byte b[]=st.getBytes();
			fout.write(b);
			
		} catch (IOException e)
		{
	
			e.printStackTrace();
			
		}
		finally 
		{
		try 
		{
			fout.flush();
		} catch (IOException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		}
		System.out.println("Write sucessfully");
		System.out.println(st);
	}
}
