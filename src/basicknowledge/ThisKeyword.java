package basicknowledge;

public class ThisKeyword
{
	
	int age;
	String name;
	double salary;
	
    void student_details(int age, String name, double salary)
    {
    	
    	this.age =age;
    	this. name = name;
    	this.salary = salary;
    	System.out.println("Name of the student is " +name+ "  Age of the student is "+age+    "  salary of the student is "+salary);
    }
	public static void main(String[] args)
	{
		ThisKeyword g1 = new ThisKeyword();
		g1.student_details(90, "ramu", 98.98);
		System.out.println(g1.name);
		System.out.println(g1.age);
		System.out.println(g1.salary);
		//g1.student_details(90, "ramu", 98.98);
	}

}
