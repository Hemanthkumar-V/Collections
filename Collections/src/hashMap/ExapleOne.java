package hashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ExapleOne {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(2,"AnyValue");
		h.put(1,"Store");
		h.put(3,"Me");
		h.put(4,"In");
		System.out.println(h);	//Using sopln
		System.out.println(h.get(2));

		
	}

}
