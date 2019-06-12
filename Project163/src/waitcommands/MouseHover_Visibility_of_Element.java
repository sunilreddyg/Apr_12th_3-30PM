package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover_Visibility_of_Element 
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	
		/*
		 * Note:-->
		 * 		Enable mouse and keybord interaction on automation
		 * 		browser by creation of object for Actions Class.
		 */
		Actions action=new Actions(driver);
	
		//Identify Element
		WebElement Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		action.moveToElement(Category).perform();
		
		
		
		//Create object for explicitwait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		By Mobile_Computers=By.xpath("//span[@class='nav-text'][contains(.,'Mobiles, Computers')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Mobile_Computers));
		System.out.println("timeout released element visible at webpage");
		
		
		
		
		

	}

}
