package assignments;

class login

{
	static void add()
	{
		System.out.println("addition");
	}
	void sub()
	{
		System.out.println("sub");
	}
}
abstract class logout extends login
{
	abstract void one();
	abstract void two();
	static void mul()
	{
		System.out.println("multiplication");
	}

	void div()
	{
		System.out.println("division");
	}
}
public class Assignment_13 extends logout
{
	static void three()
	{
		System.out.println("three");
	}
	void four()
	{
		System.out.println("four");
	}
	
	public static void main(String[] args) 
	{
		Assignment_13 g1 = new Assignment_13();
		add();
		g1.sub();
		g1.one();
		g1.two();
		mul();
		g1.div();
		three();
		g1.four();
	}
	void one() 
	{
		System.out.println("Abstract method one implementation");
	}
	void two()
	{
		System.out.println("Abstract method TWO implementation");
	}

}
