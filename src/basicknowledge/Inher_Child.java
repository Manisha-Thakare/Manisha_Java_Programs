package basicknowledge;
//single level Inheritance

class Parent_class
{
	void add()
	{
		System.out.println("Addition");
	}
	
	void sub()
	{
		System.out.println("Subtraction");
	}
}
public class Inher_Child extends Parent_class
{
	void mul()
	{
		System.out.println("Multiplication");
	}
	
	public static void main(String[] args) 
	{
		Inher_Child g1 = new Inher_Child ();
		g1.mul();
		g1.add();
		g1.sub();
	}

}
