package mouse_and_keyword_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_with_mouseActions {

	public static void main(String[] args) 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		//Switch to frame using webelement referral
		WebElement DemoFrame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//Apply switch to frame
		driver.switchTo().frame(DemoFrame);
		
		
		
		//IDentify Source and Destination Elements
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dst=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Enable Mouse and Keyboard interation at automation browser
		Actions action=new Actions(driver);
		
		//Perfrom drag and drop feature using mouse interactions..
		action.clickAndHold(src)
		.moveToElement(dst)
		.release(src).perform();
		
		

	}

}
