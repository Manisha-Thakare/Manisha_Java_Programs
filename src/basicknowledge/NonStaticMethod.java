package basicknowledge;

public class NonStaticMethod {
	/* How to access the nonstatic method inside the main method
	   need to create the object
	   syntax:Creating object: ClassName Reference variable = new ClassName
	*/
	public static void main(String[] args) 
	
	{
		NonStaticMethod a = new NonStaticMethod();
		a.add();
		
	}
	
    void add()
    {
    	System.out.println("Addition");
    	
    }
    

}
