package LinkedList;

public class MainRunner 
{
	public static void main(String[] args) {
		SingleLinkedList sl= new SingleLinkedList();
		sl.add("apple");
		sl.add("orange");
		sl.add("abc");
		sl.add("abcz");
		//System.out.println(sl);
		
		//  System.out.println(sl.deleteFirst());
//		  System.out.println(sl);
//		  System.out.println(sl.deleteLast()); 
//		  System.out.println(sl);
////		  
//		  sl.add("kivi", 0);
		   //System.out.println(sl);
	     //  sl.reverse();
		   System.out.println(sl);
		  sl.delete(2);
		   System.out.println(sl);
	}
}
