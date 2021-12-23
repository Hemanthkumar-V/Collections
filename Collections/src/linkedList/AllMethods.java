package linkedList;
import java .util.Iterator;
import java.util.LinkedList;
import java.util.Collections;
public class AllMethods
{

	public static void main(String[] args)
	{
		LinkedList<Object> list=new LinkedList<Object>();
		list.add("Coke= 200");			//Add Method
		list.add("Wine= 300");
		list.add("Wisky= 400");
		list.add("Rum= 500");
		list.add("Vodka= 600");		
		System.out.println("Added all Details of Spirits Available");
		System.out.println(list);
		list.add(5,"Brandy= 100");		//Add  Spirit at particular index position
		System.out.println("After addding Extra Spirit available in stock");
		System.out.println(list);		
		list.addFirst("Ib= 700");		//Add Spirit at first index position
		System.out.println("Adding At Special Spirit");
		System.out.println(list);       
		list.addLast("Kallu= 80");		//Adding Spirit at last position
		System.out.println("Adding element at Extra Special Element");
		System.out.println(list);
		LinkedList<Object> ar=new LinkedList<Object>();
		ar.add("Coke");
		ar.add("Coco Cola");
		ar.add("Pepsi");
		ar.add("7Up");
		System.out.println("These are Soft Drinks Available");
		System.out.println(ar);
		list.addAll(ar);			//AddAll method used to add all From top to End 
		System.out.println("Spirits available");
		System.out.println(list);
		list.remove();				//Method removes Spirit which is not available
		System.out.println("Delivarable Spirits");
		System.out.println(list);
		list.remove(0);				//Removed which is not their after Updating
		System.out.println("Payment acceptable Spirits");
		System.out.println(list);
		Collections.swap(list,0,9);		//After Swapping the Spirits Positions
		System.out.println("Please Confirm Once Before Ordering ");
		System.out.println(list);
										//Getting Spirit at particular position
		System.out.println("OfferAppliedOnThisProduct "+list.get(0));
		System.out.println("HurryUpHaveRefreshmentWith= "+list.pop());	//pop is used to get that Spirit To Display
		System.out.println(list.equals(ar));//If Spirits at ar is equal to list then this will become true
		list.clear();					//Clears all the spirits
		System.out.println("StockNotAvailable"+list);
		}

}
