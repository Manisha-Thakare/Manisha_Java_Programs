package basicknowledge;

public class MethodOverloading {
	// what is method overloading - Developing multiple methods with same name but variation in the arguments 
	//Static and non static method having return type

	void add()
	{
		int a =100;
	
		System.out.println(a+6);
	}
	
	void add (int a)
	{
		
		System.out.println(5);
	}
	
	static void add (double a)
	{
		System.out.println(a+6);
	}
	void add(int a, int b, int c, int d)
	{
		//a =100;
		System.out.println(a+b+c+d);
	}

	public static void main(String[] args)
	{
		add(4.75);
		MethodOverloading c = new MethodOverloading();
		c.add();
		c.add(2);
		c.add(11, 11, 11, 11);

	}
	
	

}
