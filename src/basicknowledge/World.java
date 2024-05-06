package basicknowledge;

public class World {
	// can it is possible class have the two same constructor with a same parameter
	
	World()   // non parameterized constructor
	{
		System.out.println("1");
	}
	/*World()        // not possible
	{
		System.out.println("1");
	}
	*/
	World(int a)  // parameterized constructor
	{
		System.out.println("2");
	}

	
	public static void main(String[] args) 
	
	{
		new World(); // parameterized object creation == World w1 = new World();
		new World(30000);  //  non parameterized object creation  == World w2 = new World();
		
	}

}
