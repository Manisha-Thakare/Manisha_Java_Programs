package basicknowledge;

public class ConstructorOverloading {

	
	ConstructorOverloading()   // non parameterized constructor
	{
		System.out.println("1");
	}
	
	ConstructorOverloading(int a)  // parameterized constructor
	{
		System.out.println("2");
	}
	ConstructorOverloading(char a)  // parameterized constructor
	{
		System.out.println("8");
	}
	ConstructorOverloading(String a)  // parameterized constructor
	{
		System.out.println("Manisha");
	}
	ConstructorOverloading(boolean a)  // parameterized constructor
	{
		System.out.println("Manisha05");
	}
	ConstructorOverloading(int a, double b)  // parameterized constructor
	{
		System.out.println("TEST");
	}
	
	
	public static void main(String[] args) 
	
	{
		new ConstructorOverloading(); // parameterized object creation == ConstructorOverloading w1 = new v();
		new ConstructorOverloading(30000);  //  non parameterized object creation  == ConstructorOverloading w2 = new ConstructorOverloading();
		new ConstructorOverloading('t');
		new ConstructorOverloading("MKT");  // anything in the double quote is always string.
		new ConstructorOverloading(true);
		new ConstructorOverloading(5, 4.15);
		
	}

}
