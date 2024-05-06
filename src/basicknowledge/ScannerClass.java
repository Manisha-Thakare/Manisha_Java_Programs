package basicknowledge;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class ScannerClass {
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		byte A1 = s1.nextByte();
		System.out.println(A1);
		short A2 = s1.nextShort();
		System.out.println(A2);
		int A3 = s1.nextInt();
		System.out.println(A3);
		long A4 = s1.nextLong();
		System.out.println(A4);
		String A5 = s1.next();
		System.out.println(A5);
		float A6 = s1.nextFloat();
		System.out.println(A6);
		double A7 = s1.nextDouble();
		System.out.println(A7);
		boolean A8 = s1.nextBoolean();
		System.out.println(A8);
		s1.close();
	}

}
