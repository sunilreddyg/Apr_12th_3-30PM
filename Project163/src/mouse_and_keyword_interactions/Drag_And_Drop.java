package mouse_and_keyword_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		driver.manage().window().maximize();
		
		
		/*
		 * Note:-->
		 * 		Enable mouse and keybord interaction on automation
		 * 		browser by creation of object for Actions Class.
		 */
		Actions action=new Actions(driver);
		
		
		//Identify Elements
		WebElement src=driver.findElement(By.xpath("//div[contains(@id,'draggable')]"));
		WebElement dst=driver.findElement(By.xpath("//div[contains(@id,'droptarget')]"));
		Thread.sleep(5000);
	
		//Perfrom drag and drop acton
		action.dragAndDrop(src, dst).build().perform();
		
		
		
		/*
		 * Example:-->
		 * 		https://jqueryui.com/droppable/
		 */
		
		
		
		

	}

}
