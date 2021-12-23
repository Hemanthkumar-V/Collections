package arrayList;

import java.util.ArrayList;

public class ArrayListContains
{

	public static void main(String[] args) 
	{
		ArrayList<Object> o=new ArrayList<Object>();
		o.add("CapGemini");
		o.add("Is a Very Good Company");
		o.add("Which Promises");
		o.add("Get the future");
		o.add("You want");
		System.out.println("This is before comparing with other object elements");
		System.out.println(o);
		ArrayList<Object> oo=new ArrayList<Object>();
		oo.add("CapGemini");
		oo.add("Is a Very Good Company");
		oo.add("Which Promises");
		oo.add("Get the future");
		oo.add("You want");				//Contains method returns true  if elements in object one is 
		for(Object res:oo )				//are same has object two or else returns  false
		System.out.println(o.add(oo.contains(res))?"Correct":"InCorrect");

	}

}
