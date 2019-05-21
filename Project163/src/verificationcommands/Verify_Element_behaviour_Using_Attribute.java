package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_behaviour_Using_Attribute 
{

	public static void main(String[] args) 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identify Sensex tab
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[@id='InvestRec']"));
		Sensex_tab.click();
		
		
		//Get Runtime class property of sensex tab
		String Runtime_Class=Sensex_tab.getAttribute("class");
		
		//Write a decison to execute statement on Sensex tab selected
		if(Runtime_Class.contains("tab-active"))
		{
			System.out.println("Sensex Tab Selected");
			
			
			
		}
		else
		{
			System.out.println("Wrong tab selected");
		}
		
		
		
		
		

	}

}
