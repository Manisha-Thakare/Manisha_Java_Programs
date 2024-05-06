package packageforinheritance;

abstract class Amazon_auth {
	abstract void un_mob();
	abstract void un();
	void login_button()
	{System.out.println("1");}	
}
abstract class Amazon_login extends Amazon_auth
{   abstract void un_email();
	abstract void un_mobile();
	void logout_button()
	{ System.out.println("2");}
}
public class Abstract_2 extends  Amazon_login {
	static void loginwith_mob()
	{ System.out.println("login with mobile");}
public static void main(String[] args)
	{   loginwith_mob();
		Abstract_2 g1 = new Abstract_2();
		g1.un_email();
		g1.un_mobile();
		g1.un_mob();
		g1.un();
		g1.logout_button();
		g1.login_button();	}
	void un_email()
	{
		System.out.println("email");	
	}
	void un_mobile() 
	{
		System.out.println("mobile");
	}
	void un_mob()
	{
		System.out.println("mob");
	}
	void un()
	{	
		System.out.println("un");
	}

}
