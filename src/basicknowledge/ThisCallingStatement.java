package basicknowledge;



public class ThisCallingStatement
{
	ThisCallingStatement()
	{
		this(5);
		System.out.println("1");
	}
	ThisCallingStatement(int a)
	{
		this(0.25);
		System.out.println("2");
	}
	ThisCallingStatement(double b)
	{
		
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		ThisCallingStatement g1 = new ThisCallingStatement(5.45);
		

	}

}
