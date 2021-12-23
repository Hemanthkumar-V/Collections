package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleTwo
{
	static String nameone="B.loreBulls";
	static String nametwo="TeluguTitans";
	static String namethree="TamilThalaivas";
	static String namefour="UpYodha";
	public static void main(String[] args) 
	{
		ArrayList<String> teams=new ArrayList<String>();
		teams.add(nameone);
		teams.add(nametwo);
		teams.add(namethree);
		teams.add(namefour);
		System.out.println(" Below are all the teams are playing for pro kabaddi 2021");
		System.out.println(teams);
	teams.add(4,"UMumba");
	System.out.println(teams);
	System.out.println("Printed after sorting");
	Collections.sort(teams);
	System.out.println(teams);
	}
}
