package arrayList;

import java.util.ArrayList;
class Bank
{
	private String name;		//making variables private accessing them using constructors
	private String IFSC;
	private int ACNo;
	Bank(String name,String IFSC,int ACNo)	//implementing constructor so that we can 
	{										//access private members
		this.name=name;
		this.IFSC=IFSC;
		this.ACNo=ACNo;
	}
	@Override
		public String toString()
		{							//Return these values as output
			return "Name"+" "+name+","+"IFSC"+" "+IFSC+","+"ACNo."+" "+ACNo;
	    }
	
}
public class OverrideMethodToString 
{

	public static void main(String[] args) 
	{
		ArrayList<Bank> get=new ArrayList<Bank>();
		get.add(new Bank("Chethan","HDFC1234",123456));
		get.add(new Bank("Chethan","HDFC1234",123456));
		get.add(new Bank("Chethan","HDFC1234",123456));
		System.out.print(get);			//Using direct printing statement
		for(Bank details:get)			//Using for each loop
		{
			System.out.println(details);
		}
		
	}

}
