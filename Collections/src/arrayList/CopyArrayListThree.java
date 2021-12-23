package arrayList;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayListThree 
{

	public static void main(String[] args) 
	{
	ArrayList<Object> al=new ArrayList<Object>();
	al.add("Cricket");
	al.add("FootBall");
	al.add("Kabaddi");
	al.add("Rugby");
	al.add("BasketBall");
	List<Object> ll=new ArrayList<Object>();	//Before Copying
	ll.add("Hockey");
	ll.add("Golf");
	ll.add("Tennis");
	al.addAll(ll);
	System.out.println("Below are the Some of the Renowed Sports");
	System.out.println(al);						//After Copying To One Element Reference

	}

}
