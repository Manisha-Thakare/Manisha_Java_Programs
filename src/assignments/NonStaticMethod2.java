package assignments;
// How to access the nonstatic method inside the main method
public class NonStaticMethod2 {
void add()
	{
		int a=100;
		int b=200;
		int sum = a+b;
		System.out.println(sum);
	}
	void sub()
	{
		int a=200;
		int b=100;
		int subt = a-b;
		System.out.println(subt);
	}
	void mul()
	{
		int a=100;
		int b=200;
		int mult = a*b;
		System.out.println(mult);
	}
	void div()
	{
		int a=200;
		int b=100;
		int divi = a/b;
		System.out.println(divi);
	}
	void mod() // percentage
	{
		int a=350;
		int b=100;
		int c = a%b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{    
		NonStaticMethod2 a = new NonStaticMethod2();
		
		a.add();
		a.sub();
		a.mul();
		a.div();
		a.mod();
	}

	}


