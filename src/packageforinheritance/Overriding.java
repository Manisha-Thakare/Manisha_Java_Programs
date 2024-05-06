package packageforinheritance;
class Method_parent
{
	static void login()
	{
		System.out.println("Login with mobile no");
	}
}

public class Overriding extends Method_parent
{
	static void login()
	{
		System.out.println("Login with Email id");
	}
	
	public static void main(String[] args)
	{
		Overriding g1 = new Overriding();
		g1.login();
       //login();
       
	}

}
