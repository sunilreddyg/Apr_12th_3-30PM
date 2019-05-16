package corejava.variables.GlobalVariables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	WebDriver driver;
	String url="http://facebook.com";
	String driver_path=null;
	String UID=null;
	String PWD=null;
	
	public void Open_App()
	{
		//Set runtime environment variable for firefox
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	
	public void User_login()
	{
		WebElement Email=driver.findElement(By.id("email"));
		Email.clear();
		Email.sendKeys(UID);
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.clear();
		Password.sendKeys(PWD);
		
		WebElement Signin_btn=driver.findElement(By.id("loginbutton"));
		Signin_btn.click();
		
	}
	

	public void Close_App()
	{
		driver.close();
	}
	
	

}
