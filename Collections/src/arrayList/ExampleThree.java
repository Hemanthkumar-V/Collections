package arrayList;
import java.util.ArrayList;
public class ExampleThree {

	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Name ="+" "+"Chethan");
		al.add("College = "+" "+"BCPUC");
		al.add("Marks ="+" "+422);
		al.add("Percentage = "+" "+70);
		for(Object res:al)
		System.out.println(res);
	}

}
