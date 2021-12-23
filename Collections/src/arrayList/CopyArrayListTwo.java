package arrayList;
								//ArrayList Copying Example
import java.util.ArrayList;

public class CopyArrayListTwo
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> i=new ArrayList<Integer>();	//Object one 
		i.add(99);		//Kannada
		i.add(98);		//English
		i.add(97);		//Physics
		ArrayList<Integer> is=new ArrayList<Integer>();	//Object two
		is.add(95);		//Chemistry
		is.add(94);		//Mathematics
		is.add(92);		//Biology
		i.addAll(is);	//Getting all Subjects Details
		System.out.println("Marks Obtained In My Puc"+i);
	

	}

}
