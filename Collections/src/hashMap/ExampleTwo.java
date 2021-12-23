package hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;			
import java.util.Iterator;		//Importing Packages from java Util package
public class ExampleTwo 
{

	public static void main(String[] args)
	{
		HashMap<Integer,Object> oo=new HashMap<Integer,Object>();
		oo.put(0,"Iam");
		oo.put(1,"Single");
		oo.put(2,"And");
		oo.put(3,"Im");
		oo.put(4,"Young");
		System.out.println(oo);	//	u	sing direct sopln we can get values
		Set s=oo.entrySet();
		Iterator<Object> iot=s.iterator();
		while(iot.hasNext())		//Using while we can get values
		{
			Map.Entry get=(Map.Entry)iot.next();
			System.out.println(get.getKey());
			System.out.println(get.getValue());
		}
	}

}
