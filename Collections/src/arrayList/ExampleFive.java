package arrayList;

import java.util.ArrayList;

public class ExampleFive {

	public static void main(String[] args) {
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(3);
		b.add(5);
		b.add(8);
		System.out.println(b.indexOf(3));//By using indexOf element we can get index positions 
		System.out.println(b.indexOf(5));
		System.out.println(b.indexOf(8));
		System.out.println(b.get(0));		//By using get method we can get  index positions of an element
		System.out.println(b.get(1));
		System.out.println(b.get(2));

	}

}
