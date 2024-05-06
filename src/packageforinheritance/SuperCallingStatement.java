package packageforinheritance;



class Parent_Class
{
	Parent_Class(int a)
	{
		System.out.println("Grand Parents");
	}
}
class Child_Class extends Parent_Class
{
	Child_Class()
	{  
		super(50);// explicity write
		System.out.println("Parents");
	}
}
public class SuperCallingStatement extends Child_Class

{
	SuperCallingStatement()
	{
		//super();  NPSCS -explicitly write
		System.out.println("Child");
	}

	public static void main(String[] args) 
	{
		
		new SuperCallingStatement();
		
		

	}

}
