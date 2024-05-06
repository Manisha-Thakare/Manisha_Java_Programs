package basicknowledge;

public class MathClass {

	public static void main(String[] args)
	{
		
		double pi = Math.PI;
		System.out.println(pi);
		System.out.println(Math.addExact(5, 6));
		System.out.println(Math.addExact(785694528, 78458257));
		System.out.println(Math.subtractExact(50, 30));
		System.out.println(Math.multiplyExact(100,9));
		System.out.println(Math.sqrt(55));
		System.out.println(Math.max(63, 93));
		System.out.println(Math.min(45, 5));
		//System.out.println(Math.random());
		for(int i=0; i<100; i++)
		{
		System.out.println(Math.random());
		}

	}

}