package arrayList;

import java.util.ArrayList;			//using arraylist we can add elements at runtime

public class ExampleOne 		
{

	public static void main(String[] args)
	{
		ArrayList<Integer> add=new ArrayList<Integer>();	//object of arraylist
		add.add(10);
		add.add(20);
		add.add(30);
		add.add(3,40);
		System.out.println("Above are the arraylist created");
		for(int i=0;i<add.size();i++)
		{
		}
		System.out.println("This is using for loop");
		System.out.println(add);
		System.out.println("This is using for each loop");
	for(int get:add)						
	{
		
		System.out.println(get);
	}
	add.remove(3);								//remove elements by using remove method at index positions
	System.out.println("This is printed without using for loop");
	System.out.println(add);
	System.out.println(add.get(2));	 
	                                                //by using get method we can access any variable 
	}										     	//at index positions

}
