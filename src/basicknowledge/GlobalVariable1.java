package basicknowledge;

public class GlobalVariable1 {

	static int age=43;//global variable
    static String name; //global variable
		 
		static void add()
		{
			System.out.println(age);
		}
		
		public static void main(String[] args)
		{
			System.out.println(name);
			age=19;
			System.out.println(age);
			//name="manisha";
	       //System.out.println(name);
	       //name ="Test";
	       //System.out.println(name);
		}

	}



