package arrayList;

import java.util.ArrayList;

public class IndexPositionRemoving 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("you");
		a.add("and");
		a.add("me");
		System.out.println(a);
		a.remove(1);
		System.out.println("After removing from 1st position"+a);
		a.remove(1);
		System.out.println("After removing at indexposition two"+a);
	}

}
