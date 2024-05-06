package basicknowledge;
class Parents
{
	static void add()
	{
		System.out.println("Addition");
		
	}
}
public class Inheritance extends Parents
{
	static void sub()
	{
		System.out.println("Subtration");
	}
	
	public static void main(String[] args) 
	
	{
		add();
		sub();
		//add();
		
	}

}
