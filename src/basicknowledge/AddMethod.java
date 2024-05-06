package basicknowledge;

public class AddMethod{
	static void add() {
		int a=100;
		int b=200;
		int sum = a+b;
		System.out.println(sum);}
	static void sub() {
		int a=100;
		int b=200;
		int subt = a-b;
		System.out.println(subt);}
	static void mul() {
		int a=100;
		int b=200;
		int mult = a*b;
		System.out.println(mult);}
	static void div() {
		int a=200;
		int b=100;
		int divi = a/b;
		System.out.println(divi);}
	static void mod(){
		int a=350;
		int b=100;
		int c = a%b;
		System.out.println(c);}
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		div();
		mod();
		
	}
	
}

