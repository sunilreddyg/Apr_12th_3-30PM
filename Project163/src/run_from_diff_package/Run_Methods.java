package run_from_diff_package;

import corejava.defautlmethods.Robot;
import corejava.staticmethods.InputDevices;

public class Run_Methods
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Running other package methods.
		 * 
		 * 	=> Before calling other package methods and variable we must
		 * 			import referrals to current class.
		 * 
		 * 			import packagename.classname;
		 * 						or
		 * 			import packagename.*;
		 */
		 
		Robot obj=new Robot();
		obj.run();
		obj.walk();
		
		
		
		//Static methods
		InputDevices.Keyboard();
		InputDevices.mouse();
		
		
		
		

	}

}
