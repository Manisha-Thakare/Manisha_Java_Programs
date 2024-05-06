package string_and_array;

public class String_Vertical_Manner {

	public static void main(String[] args) 
	{
		String input ="priya";
		/*char a1 = input.charAt(0);
		System.out.println(a1);
		char a2 = input.charAt(1);
		System.out.println(a2);
		*/
		
		for(int i=0; i<input.length(); i++)
		{
			char a1 = input.charAt(i);
			System.out.println(a1);
		}
	}

}
