package corejava.variables.GlobalVariables;

public class Run_Helper {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Create object for class
		 */
		Helper obj=new Helper();
		obj.driver_path="D:\\drivers\\chromedriver.exe";
		obj.Open_App();
		
		//Get global variable and assign value at runtime
		obj.UID="qadarshan@gmail.com";
		obj.PWD="Hello12345";
		obj.User_login();
		
	
		Thread.sleep(5000);
		obj.Close_App();

	}

}
