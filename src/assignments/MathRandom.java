package assignments;

public class MathRandom {

	public static void main(String[] args) 
	{
       double pi= 3.14;
      
		
		for (int i=0; i<10 ;i++)
		{
	    double r = Math.random();
		System.out.println("Radius of Circle "+ r);
		System.out.println("Area of Circle "+ Math.PI*r*r);
		
		}
	
	}

}
