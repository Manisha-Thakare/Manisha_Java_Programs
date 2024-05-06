package basicknowledge;

public class OrderofExecution {
	
	static //SIB
	{
		
	System.out.println("SIB");
	}
	{ //IIB
		System.out.println("IIB");
	}

	public static void main(String[] args)
	
	{   //OrderofExecution g1 = new OrderofExecution();
		System.out.println("Main Method");
	    OrderofExecution g1 = new OrderofExecution();
	    //OrderofExecution g2 = new OrderofExecution();
	
	}
	OrderofExecution()
	{
		System.out.println("Constructor");
		
		
	}
	static //SIB
	{
		System.out.println("SIB 1");

	}
	{ //IIB
		System.out.println("IIB 1");
	}
	

}
