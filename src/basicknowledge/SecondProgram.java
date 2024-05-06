package basicknowledge;

public class SecondProgram {
	
	// How to access the static method inside the main method
	
	public static void sub()
	{
		System.out.println("Subtraticon"); // we need to call each method into the main method
			
	}

	public static void main(String[] args) {
		
	  addition();
      System.out.println("Atomation batch 41");
      addition();
      addition(); // We can call many time also above the syso as well
      
	}
	
	static void addition() {
	
		System.out.println("Addition");
		
	}

}
