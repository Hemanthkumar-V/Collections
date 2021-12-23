package linkedList;

import java.util.LinkedList;		//Example of LinkedList 
import java.util.Iterator;			//Importing Packages
public class LinkedListRepresentation
{

	public static void main(String[] args)
	{
		LinkedList<String> li=new LinkedList<String>();	//By Creating Object we can add elements
		li.add("IAS");
		li.add("IPS");
		li.add("IRS");
		li.add("IFRS");
		System.out.println(li);
		li.addFirst("UPSC");		//Adding at first and last index positions
		li.addLast("Coaching");
		System.out.println("After adding first and last"+li);
		li.add(2,"Under");			//Adding at particular index position  
		System.out.println("Adding at index position 2"+li);
		Iterator<String> it=li.iterator();	//Using iterator we are Printing all elements
		while(it.hasNext());				//Using PreDefined methods has next and next
		{
			System.out.println(it.next());
		}
	}

}
