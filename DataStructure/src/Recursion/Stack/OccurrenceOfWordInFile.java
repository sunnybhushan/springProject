//wajp to count no of occurrence of each word present in the given file.
package Recursion.Stack;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Set;
public class OccurrenceOfWordInFile
{
	public static void main(String[] args) throws Exception
	{
		HashMap<String, Integer> cm=new HashMap<String,Integer>();
		FileInputStream fin= new FileInputStream("G:/hibernate.txt");
		int i;
		while((i=fin.read())!=-1)
		{
			String w="";
			while(Character.isAlphabetic(i))
			{
				w=w+(char)i;
				i=fin.read();
			}
			if(w.length()>0)
			{
				if(cm.containsKey(w))
				{
					cm.put(w,cm.get(w)+1);
				}
				else
				{
					cm.put(w,1);
				}
			}
		}
	
		Set entry=cm.entrySet();
		for (Object object : entry) {
			System.out.println(object);
		}
		
	}
}







