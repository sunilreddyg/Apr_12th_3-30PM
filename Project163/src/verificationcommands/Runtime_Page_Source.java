package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Page_Source {

	public static void main(String[] args) 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Get Current window pageSource at runtime
		String Runtime_source=driver.getPageSource();
		//System.out.println(Runtime_source);
		
		/*
		 * What we can verify with in pagesource:-->
		 * 			We can verify  [pageElements,Title,Url ---etc]
		 * 					
		 */
		
		
		
		//Write decision to accept on Expected Element presented at source
		if(Runtime_source.contains("q"))
		{

			WebElement Search_Editbox=driver.findElement(By.id("q"));
			Search_Editbox.clear();
			Search_Editbox.sendKeys("Automated");
		}
		else
		{
			System.out.println("Expected element not presented at source");
		}
		
		
		
		
		

		
		

	}

}
