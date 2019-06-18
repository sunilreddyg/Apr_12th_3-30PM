package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Dropdown_Option_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Write a program to select all dropdown options
		 *	using findelements option.
		 */
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Identify dropdown
		WebElement Month_dropdown=driver.findElement(By.id("month"));
		
		//Find list of Option tag elements under Month dropdown
		List<WebElement> AllOptions=Month_dropdown.findElements(By.tagName("option"));

		
		//Iterate for list of options time
		for (int i = 0; i < AllOptions.size(); i++)
		{
			
			//Using get method target each object with help of index number
			WebElement EachOption=AllOptions.get(i);
			EachOption.click();
			Thread.sleep(1000);
			
		}
	}

}
