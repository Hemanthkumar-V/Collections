package linkedList;
				//PROGRAM to analyse linked list
import java.util.LinkedList;

public class AddAndRemoveInLinkedList {

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("Banglore");
		l.add("Chennai");
		l.add("Hyderabad");
		l.add("Mumbai");
		l.add("Thiruvananthapuram");
		System.out.println("Before Removing"+l);
		l.remove();
		System.out.println("After removing at index position at 0");
		l.remove(2);		//Removing as per index positions
		System.out.println("After removing at index  position 2"+l);
				

	}

}
