package assignments;

public class Assignment_4 {
	// Create a constructor, overload them and one of the constructor have 7 parameter 
	Assignment_4()   // non parameterized constructor
	{
		System.out.println("1");
	}
	Assignment_4(int a)  // parameterized constructor
	{
		System.out.println("2");
	}
	Assignment_4(char a)  // parameterized constructor
	{
		System.out.println("8");
	}
	Assignment_4(String a, boolean b, int c, double d, float e, char f, int g)  // parameterized constructor
	{
		System.out.println("Manisha");
	}
	public static void main(String[] args) 
	{
		new Assignment_4(); 
		new Assignment_4(30000);  
		new Assignment_4('t');
		new Assignment_4("Mani", true, 5, 78.45, 7.59f, 'T', 8 );  	
	}
}

	
	
	
	
