package basicknowledge;

public class OrwithAnd {

	public static void main(String[] args)
	{
		int a=20;
		int b=30;
		if(!(a==b || b!=a))
		{
             System.out.println("or with andd operator");
	    }
		if(!(a==b && b!=a))
		{
             System.out.println("And with andd operator");
	    }

    }
}
