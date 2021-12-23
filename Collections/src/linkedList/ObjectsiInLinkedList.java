package linkedList;
import java.util.LinkedList;
public class ObjectsiInLinkedList 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("first3");
		ll.add("first2");
		System.out.println("Before using any methods"+ll);
		ll.addFirst("first");
		ll.addFirst("Second");  		
		System.out.println("After Adding at first"+ll);
		ll.addLast("Last");
		ll.addLast("Last");
		System.out.println("After adding at last index"+ll);
		System.out.println("Element of index is "+ll.indexOf("first"));
		System.out.println("Element of index is "+ll.indexOf("first"));
		System.out.println("Element of index is "+ll.indexOf("first3"));
		System.out.println("Element of index is "+ll.indexOf("first2"));
		Object tres=ll.get(3);
		System.out.println(tres);
	}

}
