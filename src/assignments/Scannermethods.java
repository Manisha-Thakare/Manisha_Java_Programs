package assignments;

import java.util.Scanner;



public class Scannermethods 
{
  static Scanner a1 = new Scanner (System.in);
	
	void add()
	  {

		int b = a1.nextInt();
		byte c = a1.nextByte();
		short d = a1.nextShort();
		long e = a1.nextLong();
		long sum = b+c+d+e;
      System.out.println(sum);
      }
	static void min()

	 {
         boolean b = a1.nextBoolean();
		 String c = a1.next();
		 String sum = b+c;
		System.out.println(sum);

	 }
	static void addition()

	 {
		float b = a1.nextFloat();
		double c = a1.nextDouble();
		double sum = b+c;
		System.out.println(sum);

	 }

	public static void main(String[] args)
	{
		Scannermethods g1 = new Scannermethods();
		g1.add();
		min();
		addition(); 
	}

	

}

