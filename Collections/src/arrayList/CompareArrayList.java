package arrayList;
import java.util.ArrayList;
public class CompareArrayList			//comparision ArrayList
{

	public static void main(String[] args) 
	{
	ArrayList<String> arr=new ArrayList<String>();//ArrayList object one
	arr.add("Hii");
	arr.add("This");
	arr.add("Chethan");
	ArrayList<String> ar=new ArrayList<String>();//ArrayList object two
	ar.add("Hii");
	ar.add("This");
	ar.add("Chethan");								//Since in this example all the values are same at index positions it will show correct 
	ArrayList<String> Compare=new ArrayList<String>();//ArrayList Object to compare the other two objects from these
	for(String temp:arr)
	{
		Compare.add(ar.contains(temp)?"correct":"false");	//Contains method shows true if all the vales at index positions of  
		System.out.println(Compare);						//previous two object variables are same
	}
	
	}

}
