package basicknowledge;

public class AccessSpecifier 
{
	
	public static void add()
	{
		System.out.println("1");
	}
	private void sub()
	{
		System.out.println("2");
	}
	protected void mul()
	{
		System.out.println("3");
	}
	void dic()
	{
		System.out.println("4");
	}
	public static void main(String[] args) 
	
	{   AccessSpecifier g1 = new AccessSpecifier();
	    add();
	    g1.sub();
	    g1.mul();
	    g1.dic();
		

	}

}
