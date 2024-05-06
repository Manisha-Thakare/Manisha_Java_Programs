package basicknowledge;

public class Constructor {
	/*
	 Special Type of method in java which will have no return type
	 Constructor will always have the same name as class name
	 Constructor can have all type of access specifier
	 Constructor can be parameterized or non parameterized
	 Constructor will always be non static in nature
	 
   */
	
	// How to call Constructor - Constructor can be invoked or call the moment you create an object
	// 1.class name RV = NEW Classname();  -- constructor with nonstatic method
	///2.new classname();  -- just want to call constructor
	
	Constructor()
	 {
		System.out.println("Constructor01");
	 }
	 void add()
	 {
		 System.out.println("Non Static");
	 }
	 static void sub()
	 {
		 System.out.println("Static method");
	 }
	 
	public static void main(String[] args) 
	{
	
		Constructor a = new Constructor();
		a.add();
		sub();
		
				
	}

}
