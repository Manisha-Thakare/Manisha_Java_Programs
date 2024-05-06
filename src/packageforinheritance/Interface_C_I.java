package packageforinheritance;

interface Keyboard
{
	void login();
}
public class Interface_C_I implements Keyboard
{

	public static void main(String[] args)
	{
		Interface_C_I g1 = new Interface_C_I();
		g1.login();
		
	}

	public void login()
	{
		System.out.println("login");
		
	}

}
