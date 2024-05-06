package string_and_array;

public class StringFunction {

	public static void main(String[] args)
	{
		String name ="School";
		int g1= name.length();
		System.out.println("Lenght of the School = " +g1);
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('S'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" name is ABC "));
		String first_name =  "Manisha";
		String second_name = "Thakare";
		System.out.println(first_name.concat (" ").concat (second_name));
		System.out.println(name.contains("hoo"));  //case sensitive
		
		
	}

}
