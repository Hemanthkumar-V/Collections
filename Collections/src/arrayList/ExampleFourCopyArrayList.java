package arrayList;

import java.util.ArrayList;		//Import packages for arraylist and list bcz we want to create object 
import java.util.List;			//of arraylist and list

public class ExampleFourCopyArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();	//object of ArrayList
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("This is before copying "+al);
		List<Integer> li=new ArrayList<Integer>();		//Object of List UpCasting
		li.add(40);							//But we can't Create of object of List bcz it is interface class
		li.add(50);
		li.add(60);
		//by using another method add all
		al.addAll(li);
		System.out.println("This is after Copying"+al);
		
	}

}
