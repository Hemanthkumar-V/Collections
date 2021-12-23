package arrayList;

import java.util.ArrayList;				//Pcakage Importing ArrayList
public class ArrayListRemove {

	public static void main(String[] args) {
		ArrayList<Object> aa=new ArrayList<Object>();
		aa.add("Bullet");
		aa.add("BMW");
		aa.add("Ninja");
		aa.add("Fazer");
		aa.add("Pulsar");
		aa.add("Ns");				//Adding Elements By add method
		System.out.println("This are printed Before Removing Elements at particular Position"+aa);
		aa.remove(5);
		aa.remove(4);
		aa.remove(3);
		aa.remove(2);
		aa.remove(1);				//We Can Remove Elements By Index Positions 
		aa.remove("Bullet");		//We Can Remove Elements By Value Also
		System.out.println("This Are Printed After Removing Elements"+aa);
		
	}

}
