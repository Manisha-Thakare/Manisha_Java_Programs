package basicknowledge;

public class LocalVariable {

	static void add()
	{
		int a=10; //local variable
		int b=20; //local variable
		System.out.println(a+b);
		
	}
	void add(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public static void main(String[] args)
	{
		int a=100; //local variable
		a=10;
		System.out.println(a);
		add();
		LocalVariable L1 =new LocalVariable();
		L1.add(50, 30);
		

	}

}
