package assignments;

public class Assignment_08 {
 // Program to do add,sub,mul,mod using global variable
	static int a= 100;
	static int b= 200;
	static void add()
	{
		int sum = a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int subt =b-a;
		System.out.println(subt);
	}
	static void mul()
	{
		int mult = a*b;
		System.out.println(mult);
	}
    void div()
	{
		int divi = a/b;
		System.out.println(divi);
	}
    void mod() // percentage
	{
		int c = a%b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		Assignment_08 T = new Assignment_08();
		T.div();
		T.mod();
		
	}
	
}
	
	
