package arrayList;

import java.util.ArrayList;

public class IndexPositionAdding {

	public static void main(String[] args) {
		ArrayList<String> all=new ArrayList<String>();	//Object of arraylistOne
		all.add("a");									//adding elements
		all.add("b");
		all.add("c");
		System.out.println("ArrayList before adding"+all);
		ArrayList<String> al=new ArrayList<String>();	//Object of ArrayListTwo
		al.add("d");									//adding elements again
		al.add("e");
		al.add("f");
		System.out.println("ArrayList before addall"+al);
	/*	all.addAll(3,al);
		System.out.println("ArrayList after adding emelents at index positions"+all);*/
		al.addAll(0,all);
		System.out.println("After adding all"+al);		//Adding elements as per the index positions
	}

}
