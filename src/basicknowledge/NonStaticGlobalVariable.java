package basicknowledge;

public class NonStaticGlobalVariable {
	
	String name= "Postman";
	

	public static void main(String[] args)
	{
		NonStaticGlobalVariable g1 =new NonStaticGlobalVariable();
		g1.name ="manisha";
		
		System.out.println(g1.name);

	}

}
