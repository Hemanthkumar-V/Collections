package linkedList;
import java.util.LinkedList;
import java.util.List;
public class SublistInLinkedList
{

	public static void main(String[] args) 
	{
		LinkedList<String> s=new LinkedList<String>();
		s.add("Chairs");
		s.add("Tables");
		s.add("Stool");
		s.add("Bench");
		System.out.println("This is without using sublist "+s);
		List<String> l=s.subList(0,2);	//Sublist Always targets length wise not index  position wise
		System.out.println("This is by using sublist "+l);
		System.out.println(s.subList(1, 2));		


	}

}
