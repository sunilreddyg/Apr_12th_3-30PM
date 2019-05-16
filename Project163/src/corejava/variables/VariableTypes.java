package corejava.variables;

public class VariableTypes 
{
	String email="sunil@gmail.com";     //Instant Variable
	static String mobile="90300248855"; //Class Variable
	
	public void method1()
	{
		String name="WebDriver";    //Local variable
		System.out.println("Tool name is => "+name);
		
		System.out.println("Global variable is => "+email);
		System.out.println("Class variable is => "+mobile);
	}
	
	public void method2()
	{
		System.out.println("Global variable is => "+email);
		System.out.println("Class variable is => "+mobile);
	}
	

	public static void main(String[] args) 
	{
		
		/*
		 * Instant variable to call from main method with in class
		 * => We must create object to call any instant variable from main method
		 */
		VariableTypes obj=new VariableTypes();
		String New_email=obj.email;
		System.out.println("Instant variable from main method is => "+New_email);

		/*
		 * We can call any class variable directly without object creation.
		 */
		String new_Mobile=mobile;
		System.out.println("Class variable from main method is => "+new_Mobile);
		
		
	}

}
