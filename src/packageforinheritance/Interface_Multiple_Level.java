package packageforinheritance;

interface You_Tube
{
	void watch_later();
	void play();
}
interface Gmail
{
	void send_schedule();
	void inbox();
}

public class Interface_Multiple_Level implements You_Tube,Gmail
{
	public static void main(String[] args) 
	{
		Interface_Multiple_Level g1 = new Interface_Multiple_Level();
		g1.send_schedule();
		g1.inbox();
		g1.watch_later();
		g1.play();
	}
	public void send_schedule()
	{
		System.out.println("one");
	}
	public void inbox() 
	{
		System.out.println("two");
	}
	public void watch_later() 
	{
		System.out.println("three");
	}
	public void play() 
	{
		System.out.println("four");
	}

}
