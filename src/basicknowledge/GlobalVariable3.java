package basicknowledge;

public class GlobalVariable3 {
    String name ="Tina"; 
    int age =19;
    double weight=  90.56;
    void add(String name, int age, double weight)
    {
    	System.out.println("hey my boo data is " + name+ " "  +age+ " "   + weight);
    	
    }
    
	public static void main(String[] args)
	{
		GlobalVariable3 g1 = new GlobalVariable3();
		System.out.println(g1.name);
		System.out.println(g1.age);
		g1.add("Mira", 80, 87.56);
		
	}

}
