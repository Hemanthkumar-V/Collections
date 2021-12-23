package arrayList;

import java.util.ArrayList;					//Importing Packages ArrayList And List
import java.util.List;						//Since List is Interface we can't Create Object of 
											//List 
public class CopyArrayAtParticularPosition 
{

	public static void main(String[] args)
	{
	ArrayList<Integer> in=new ArrayList<Integer>();
	in.add(88);
	in.add(56);
	in.add(33);
	in.add(0,00);
	in.add(1,11);			//Adding Elements at particular Position
	in.add(3,22);
	List<Integer> add=new ArrayList<Integer>();	//We Can do UpCasting for List 
	add.add(79);
	add.add(50);
	in.addAll(add);
	System.out.println(in);			//Finally Printing all the Elements as per their Index position
	
	

	}

}
