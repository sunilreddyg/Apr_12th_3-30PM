package framework_junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Example_All_junit_Annotations {

	@BeforeClass  //Invoke before execution of First @Test annotation with in class
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("BeforeClass");
	}

	@AfterClass  //Invoke after execution of last @Test annotation with in class.
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("AfterClass");
	}

	@Before  //Invoke before execution of every @Test with in class
	public void setUp() throws Exception
	{
		System.out.println("BeforeMethod");
	}

	@After   //Invoke after execution of every @Test annotated method with in class
	public void tearDown() throws Exception
	{
		System.out.println("AfterMethod");
	}

	@Test  //@Test annotated method invoke without object cration
	public void tc001()
	{
		System.out.println("tc001 executed successfull");
	}
	

	@Test  //@Test annotated method invoke without object cration
	public void tc002()
	{
		System.out.println("tc002 executed successfull");
	}
	
	@Test  //@Test annotated method invoke without object cration
	public void tc003()
	{
		System.out.println("tc003 executed successfull");
	}

}
