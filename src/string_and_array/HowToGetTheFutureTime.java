package string_and_array;

import java.util.Date;

public class HowToGetTheFutureTime {

	public static void main(String[] args)
	
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		System.out.println(d1);
		Date d2 = new Date(d1.getTime() + (60*60*1000*24*1));
		// Date d2 = new Date(d1.getTime() - (60*60*1000*24*1));
		System.out.println(d2);
		String input =d2.toString();
		System.out.println(input);
		String month = input.substring(4, 7);
		System.out.println(month);
		String date = input.substring(8, 10);	
		System.out.println(date);
		//System.out.println(input.length());
		//String year1 = input.substring(24);
		String year = input.substring(input.length()- 4);	
		
		
		System.out.println(year);
		System.out.println("=================");
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		

	}

}
