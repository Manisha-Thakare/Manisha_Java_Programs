package assignments;

import java.util.Scanner;
// create a class and five methods using user input at run time
public class Assignment_11New {
	
	static Scanner S1=new Scanner(System.in);
	static void add()
	{
		int a = S1.nextInt();
		int b = S1.nextInt();
		int sum = a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a = S1.nextInt();
		int b = S1.nextInt();
		int sub = a-b;
		System.out.println(sub);
	}
	static void div()
	{
		
		int a = S1.nextInt();
		int b = S1.nextInt();
		int div = a/b;
		System.out.println(div);
	}
	static void mul()
	{
		
		int a = S1.nextInt();
		int b = S1.nextInt();
		int mul = a*b;
		System.out.println(mul);
	}
	static void mod()
	{
		int a = S1.nextInt();
		int b = S1.nextInt();
		int mod = a%b;
		System.out.println(mod);
	}
	public static void main(String[] args)
	{
	    add();
	    sub();
	    div();
	    mul();
	    mod();
	}

}
