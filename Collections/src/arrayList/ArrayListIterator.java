package arrayList;

import java.util.ArrayList;			//using package ArrayList and iterator
import java.util.Iterator;			//we can print all added elements in an ArrayList

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Add");
		a.add("Me");
		a.add("To Main");
		a.add("Group");
		Iterator<String> it=a.iterator();	//Object of an iterator
		while(it.hasNext())					//giving condition to while loop go to hasNext method 
		{
			System.out.println(it.next());
		}
		

	}

}
