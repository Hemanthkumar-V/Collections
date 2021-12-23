package enumM;
enum Names
{
	CHETHAN,
	CHAITHRA,
	SOWMYA,
	NETHRA
}
public class NamesOf
{

	public static void main(String[] args) 
	{
		 Names na= Names.CHETHAN;
		 switch(na)
		 {
		 case CHETHAN:System.out.println("chethan is found");
		 break;
		 case CHAITHRA:System.out.println("chaithra is found");
		 break;
		 case SOWMYA:System.out.println("sowmya is found");
		 break;
		 case NETHRA:System.out.println();
		default:System.out.println("Invalid name");
		 }
	}

}
