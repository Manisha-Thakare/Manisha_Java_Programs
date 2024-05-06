package packageforinheritance;

interface xyz
{
	void once();
	void two();
}


interface two extends xyz
{
	void three();
	void four();
}

public class Interface_C_I_I implements two
{
    void order_page()
    {
    	System.out.println("Order Page");
    }
   static void address_page()
    {
	   System.out.println("Address Page");
    }
	public static void main(String[] args) 
	{
		Interface_C_I_I g1 = new Interface_C_I_I();
		address_page();
		g1.order_page();
		g1.once();
		g1.two();
		g1.three();
		g1.four();

	}

	public void once() 
	{
		System.out.println("one");
	}
	
	public void two() 
	{
		System.out.println("two");	
	}
	
	public void three()
	{
		System.out.println("three");		
	}
	
	public void four()
	{
		System.out.println("four");	
	}



}
