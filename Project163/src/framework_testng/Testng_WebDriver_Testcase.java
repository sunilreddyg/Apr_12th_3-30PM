package framework_testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Testng_WebDriver_Testcase {
 
	public WebDriver driver; 
	String url="http://facebook.com";
	  
  
  
  	@Test
	public void verify_signup_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Reporter.log("Signup link title  is => "+driver.getTitle());
	}
	
	@Test
	public void verify_Signin_link() 
	{

		 driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
		 Reporter.log("Signin link title is => "+driver.getTitle());
	}
	
	@Test
	public void verify_Messenger_link() 
	{
		
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Reporter.log("Messenger link title is => "+driver.getTitle());
	}

	@Test
	public void verify_Games_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Games')]")).click();
		Reporter.log("Games link titel is => "+driver.getTitle());
	}


	@Test
	public void Verify_Services_link()
	{
		driver.findElement(By.linkText("Services")).click();
		Reporter.log("Services link title is => "+driver.getTitle());
	}
	
  
  
  
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  //loading webpage before invoke every test case
		  driver.get(url);
	  }
	
	  @AfterMethod
	  public void afterMethod(Method method) throws IOException, InterruptedException
	  {
		  	//Capture sceen shot after every test..
		  	Thread.sleep(3000);
		  	//Get system Default date
		  	Date d=new Date();
		  	//Create simple date format
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
			//Convert default date using simple date format
			String time=sdf.format(d);
			
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screens\\"+time+method.getName()+".png"));
	  }
	
	  @BeforeClass
	  public void beforeClass()
	  {	  System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }
	
	  @AfterClass
	  public void afterClass() throws InterruptedException 
	  {
		  Thread.sleep(5000);
		  driver.close();
		  
	  }

}
