package assignments;

import java.util.Scanner;

public class Asssignment_11 {
// Arithmetic Operation using Human input
	public static void main(String[] args) 
	

	{
		Scanner S1=new Scanner(System.in);
		int a = S1.nextInt();
		int b = S1.nextInt();
		int sum = a+b;
		System.out.println(sum);
		int subt = a-b;
		System.out.println(subt);
		int mult = a*b;
		System.out.println(mult);
		int divi = a/b;
		System.out.println(divi);
		int c = a%b;
		System.out.println(c);
		S1.close();
		
		
		

	}

}
