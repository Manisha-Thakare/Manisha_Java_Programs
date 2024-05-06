package basicknowledge;
class Grand_Parents
{
	static void add()
	{
		System.out.println("addition");
	}
}
class Parents_Class extends Grand_Parents
{
	static void sub()
	{
		System.out.println("sub");
	}
}

public class Multi_Level_Inheritance extends Parents_Class
{
	
	static void mul()
	{
		System.out.println("mul");
	}
	
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		

	}

}
