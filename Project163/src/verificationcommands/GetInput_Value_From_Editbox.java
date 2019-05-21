package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInput_Value_From_Editbox 
{

	public static void main(String[] args) 
	{
		
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		
		//Identify editbox and type text init
		WebElement Email_editbox=driver.findElement(By.id("identifierId"));
		Email_editbox.clear();
		Email_editbox.sendKeys("sunilreddy.gajjala@gmail.com");
		
		
		/*
		 * How to capture text inside editbox. Inside editbox
		 * any text we can call it as INPUT..
		 */
		
		String InputData=Email_editbox.getAttribute("value");
		System.out.println("Typed mail at Email editbox is => "+InputData);
		
		
		
		

	}

}
