package enumM;
enum ExampleOne
{
	CHETHAN,
	SOWMYA,
	CHAITHRA,
	NETHRA
}
public class ConnectingToEnumExampleOne {

	public static void main(String[] args) {
		ExampleOne eo=ExampleOne.SOWMYA;
		if(eo==ExampleOne.SOWMYA)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
