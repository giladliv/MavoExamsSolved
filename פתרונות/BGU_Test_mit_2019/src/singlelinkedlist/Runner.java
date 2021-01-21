package singlelinkedlist;

public class Runner {

	public static void main(String[] args)
	{
		SingleLinkedList myList = new SingleLinkedList();
		String[] strArr = {"1", "6", "2", "3", "6", "1", "1", "4", "9", "4"};
		for (int i = 0; i < strArr.length; i++)
		{
			myList.addLast(strArr[i]);
		}
		myList.removeDuplicate();
		
		System.out.println(myList);
		
		
	}

}
