package mouse_and_keyword_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_on_Element 
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//Enable keyword and mouse interactions at webpage
		Actions action=new Actions(driver);
		
		//Perform hover action on selected element
		WebElement Main_Category=driver.findElement(By.xpath("//span[text()='Category']"));
		action.moveToElement(Main_Category).perform();
		Thread.sleep(5000); //Timeout to load sub categories.
		
		
		//Pefrom hover action on sub category
		WebElement Sub_Category=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		action.moveToElement(Sub_Category).perform();
		
		
		//Perform click action on link using mouse interfaction
		WebElement Laptops_link=driver.findElement(By.xpath("//span[text()='Laptops']"));
		action.click(Laptops_link).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
