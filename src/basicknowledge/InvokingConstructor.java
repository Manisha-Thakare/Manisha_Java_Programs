package basicknowledge;

class StudentClass
{
	StudentClass(int a)
	{
		System.out.println("Student Constructor");
	}
}



public class InvokingConstructor {
	
	InvokingConstructor()
	{
		System.out.println("InvokingConstructor");
		
	}

	public static void main(String[] args)
	
	{
		new InvokingConstructor();
		new StudentClass(4);
	}

}
