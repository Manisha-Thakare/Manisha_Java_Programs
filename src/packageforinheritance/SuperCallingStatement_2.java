package packageforinheritance;
class College
{
	College(String college )
	{
		System.out.println("College");
	}
}


class School extends College
{
	School(int a, String b, double c)
	{
		super("SVGE COLLEGE");
		System.out.println("School");
	}
}

public class SuperCallingStatement_2
{

	public static void main(String[] args)
	{
		School s1 = new School(100, "ram", 87.56);
		
		
				
	}

}
