package singlelinkedlist;

public class SingleLinkedList
{
	private Node head;
	private int size;
	
	public SingleLinkedList()
	{
		head = null;
		size = 0;
	}
	
	public void addLast(String element)
	{
		if (head==null)
		{
			head = new Node(element);
		}
		else
		{
			Node pointer = head;
			while(pointer.next != null)
				pointer = pointer.next;
			pointer.next = new Node(element);
		}
		size++;
	}
	
	public String toString()
	{
		if(head == null)
			return "[]";
		String res = "[";
		Node pointer = head;
		
		while(pointer.next != null)
		{
			res = res + pointer.toString()+", ";
			pointer = pointer.next;
		}
		res = res + pointer.toString();
		return res + "]";
	}
	
	public void removeDuplicate()
	{
		Node run = head;
		while (run != null)
		{
			removeByFirstNode(run);
			run = run.next;
		}
	}
	
	private void removeByFirstNode(Node node)
	{
		Node start = node;
		if (start == null) { return; }
		
		Node run = node;
		while (run != null && run.next != null)
		{
			if (start.data.equals(run.next.data))
			{
				Node temp = run.next;
				run.next = temp.next;
				temp.next = null;
			}
			else
			{
				run = run.next;
			}
			
		}
		
	}
}
