package Task5;

public class MyLinkedList {
	Node head;
	int size;
	
	public MyLinkedList()
	{
		head = null;
		size = 0;
	}
	
	public void add(String data)
	{
		if (head == null)
		{
			head = new Node(data);
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = new Node(data);
		}
		size++;
	}
	
	public String toString()
	{
		String ans = "[";
		
		if (head == null) ans = "[]";
		else 
		{
			Node n = head;
			while(n.next != null)
			{
				ans = ans + n.data + ", ";
				n = n.next;
			}
			ans = ans + n.data +"]";
		}
		return ans;
	}
	
	public Node addSorted(Node original, Node node)
	{
		if (node == null) { return original; }
		
		if (original == null)
		{
			original = node;
		}
		else if (node.data.compareTo(original.data) < 0)
		{
			node.next = original;
			//original = ;
			return node;
		}
		else
		{
			Node start = original;
			while (original.next != null && node.data.compareTo(original.next.data) >= 0)
			{
				original = original.next;
			}
			node.next = original.next;
			original.next = node;
			original = start;
		}
		
		return original;
	}
	
	public void sort()
	{
		Node tempNode = null;
		Node single = null;
		while (head != null)
		{
			single = head;
			head = head.next;
			single.next = null;
			
			tempNode = addSorted(tempNode, single);
		}
		head = tempNode;
	}
	
	public boolean swap (int i, int j)
	{
		if (i < 0 || size <= i || j < 0 || size <= j)
		{
			return (false);
		}
		
		int a = Math.min(i, j);
		int b = Math.max(i, j);
		
		if (a == b) { return true; }
		
		Node prevFirst = head;
		Node prevSecond = head;
		for (int k = 0; k < a - 1; k++)
		{
			prevSecond = prevSecond.next;
		}
		for (int k = 0; k < b - 1.; k++)
		{
			prevSecond = prevSecond.next;
		}
		
		if (a == 0)
		{
			Node temp = prevFirst.next;
			prevFirst.next = prevSecond.next.next;
			prevSecond.next.next = temp;
			
			temp = prevSecond.next;
			prevSecond.next = prevFirst;
			head = temp;
		}
		else
		{
			Node temp = prevFirst.next.next;
			prevFirst.next.next = prevSecond.next.next;
			prevSecond.next.next = temp;
			
			temp = prevFirst.next;
			prevFirst.next = prevSecond.next;
			prevSecond.next = temp;
		}
		
		return (true);
	}
	
	public static void main(String[] args)
	{
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add("c");
		linkedList.add("b");
		linkedList.add("d");
		linkedList.add("a");
		linkedList.add("e");
		
		System.out.println(linkedList);
		
		linkedList.sort();
		
		System.out.println(linkedList);
		
		linkedList = new MyLinkedList();
		String str = "abcdef";
		for (int i = 0; i < str.length(); i++)
		{
			linkedList.add(String.valueOf(str.charAt(i)));
		}
		
		System.out.println(linkedList.swap(1, 5));
		System.out.println(linkedList);
		System.out.println(linkedList.swap(0, 5));
		System.out.println(linkedList);
	}
	
}

