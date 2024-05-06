package basicknowledge;

/*  Syntax 1      -- whichever first condition is true.. only execute , other condition ignore by java
 * if(condition 1)
 * {
 * }
 * else if(condition 2)
 * {
 * }
 * else
 * {
 * }
 * 
 * 
 * syntax 2
 *  if(c1)
 *  {}
 *  else if(c2)
 *  {}
 *  else if(c3)
 *  {}
 *  else
 *  {}
 */

public class IfelseIf {

	public static void main(String[] args) 
	
	{
		int a=10;
		int b= 20;
		if(a>b)
		{
			System.out.println("1");
		}
		else if(a<=b)
		{
		    System.out.println("2");
		}
		else if(a>=b)
		{
		    System.out.println("3");
		}
		else if(a!=b)
		{
		    System.out.println("4");
		}
		else		{
			 System.out.println("5");
		}
	}

}
