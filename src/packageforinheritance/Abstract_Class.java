package packageforinheritance;
abstract class one
{
	abstract void add();  //abstract method
	
}
public class Abstract_Class extends one

{
	void logout() //concrete method
	{
		System.out.println("logout");
		
	}
	public static void main(String[] args) 
	
	{
		Abstract_Class g1 = new Abstract_Class();
		g1. add();		
		g1.logout();
	}

	void add()  //concrete method
	{
	System.out.println("abstract class");
	}

}
