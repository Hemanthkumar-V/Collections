package arrayList;
import java.util.ArrayList;
public class ArrayListAtGetIndexPosition 
{

	public static void main(String[] args)
	{
		ArrayList<Character> ss=new ArrayList<Character>();
		ss.add('A');
		ss.add('B');
		ss.add('C');
		ss.add('D');
		System.out.println("Printed before getting index positions"+ss);
		System.out.println("This all are index position of A = "+ ss.indexOf('A'));
		System.out.println("Index Position Of B = "+ss.lastIndexOf('B'));
	}

}
