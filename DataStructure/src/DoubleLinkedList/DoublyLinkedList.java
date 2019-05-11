package DoubleLinkedList;

public class DoublyLinkedList 
{
	//nested class
	class Node
	{
		 Object data;
		 Node next;
		 Node prev;
		 Node (Object data)
		 {
			 this.data=data;
		 }
	}
	
	Node head;
	int size;
	
	public DoublyLinkedList()
	{
		head=null;
		size=0;
	}
	
	public void add(Object obj)
	{
		Node n=new Node(obj);
		if(head==null)
		{
			head=n;
			return;
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		t.next=n;
		n.prev=t;
		size++;
	}
	public void addFirst(Object obj)
	{
		Node n= new Node(obj);
		if(head==null)
		{
			head=n;
			return;
		}
		head.prev=n;
		n.next=head;
		head=n;
		size++;
	}
	
	public String toString()
	{
		String st="[";
		Node t=head;
		while(t!=null)
		{
			st=st+t.data;
			
			if(t.next!=null)
				st=st+",";
			
			t=t.next;
		}
		st=st+"]";
		return st;
	}
	public Object deleteFirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return null;
		}
		Object obj=head.data;
		head=head.next;
		head.prev=null;
		size--;
		return obj;
	}
	public Object deleteLast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return null;
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		if(t.prev==null)
			head=null;
		
		t.prev.next=null;
		size--;
		return t.data;
	}
	
	public Object delete(int in)
	{
		if(in<0 || in>=size)
		{
			System.out.println("index not in the range..");
			return null;
		}
		
		if(head==null)
		{
			System.out.println("list is empty..");
			return null;
		}
		Node t=head;
		while(t!=null)
		{
			if(in==0)
				break;
			in--;
			t=t.next;
		}
		if(t.prev!=null)
		{
			t.prev.next=t.next;
		}
		else
		{
			head=head.next;
			head.prev=null;		
		}
		if(t.next!=null)
		{
			t.next.prev=t.prev;
		}
		size--;
		return t.data;
	}
	public void add(Object obj, int in)
	{
		if(in<0 || in>size)
		{
			System.out.println("index not in the range..");
			return;
		}
		
		if(in==0)
		{
			addFirst(obj);
			return;
		}
		Node t=head;
		while(t.next!=null)
		{
			if(in==0)
				break;
			in--;
			t=t.next;
		}
		Node n= new Node(obj);
		if(t.next==null)
		{
			t.next=n;
			n.prev=t;
			return;
		}
		n.next=t;
		n.prev=t.prev;
		t.prev=n;
		size++;
		
		
	}
	
}




















