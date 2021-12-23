package arrayList;
//Program to Analyse copying of elements using 2 objects
import java.util.ArrayList;

public class CopyArrayListOne 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();	//adding elements using object one
		a.add("Pigeon");								
		a.add("Parrot");
		a.add("Peacock");
		a.add("Humming");
		System.out.println("This are before copying :"+a);
		ArrayList<String> b=new ArrayList<String>();	//adding elements using object two
		b.add("Swift");
		b.add("Sparrow");
		b.add("Eagle");
		a.addAll(b);									//all elements are added using addAll method
		System.out.println("This is after Copying all a and b elements"+a);

	}

}
