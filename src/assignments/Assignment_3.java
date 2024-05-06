package assignments;

public class Assignment_3 {
	
	// class with a mixture of static and non static method

	void add()
    {
    	System.out.println("Addition");
    	
    }
	
	static void sub()
	{
		System.out.println("subtraction");
		
	}
	
	public static void main(String[] args)
	{
		Assignment_3 a = new Assignment_3();
		a.add();
		sub();
	}

}
