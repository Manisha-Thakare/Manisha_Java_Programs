package basicknowledge;

public class ThisCallingStatement_2 
{
	ThisCallingStatement_2 ()
	{  this(2);
		System.out.println("1");
	}
	
	ThisCallingStatement_2 (int a)
	{
		this("Manisha");
		System.out.println("2");
	}
	ThisCallingStatement_2 (String b)
	{
		this('A', "Manisha");
		System.out.println("3");
	}
	ThisCallingStatement_2 (char a, String b)
	{
		System.out.println("4");
	}
	public static void main(String[] args)
	{
		ThisCallingStatement_2  s1 = new ThisCallingStatement_2 ();
		

	}

}
