package framework_junit;

import org.junit.Ignore;
import org.junit.Test;

public class Junit_Method_Ignore
{
	
	@Test
	public void tc001()
	{
		System.out.println("tc001 executed");
	}
	
	@Ignore //Annotation ignore method to run..
	public void tc002()
	{
		System.out.println("tc002 executed");
	}

	
	
	public void tc003()
	{
		System.out.println("tc003 executed");
	}
}
