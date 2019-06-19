package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Window_Scroll
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	
		
		//Scroll window vertial
		((JavascriptExecutor)driver).executeScript("window.scroll(100,1000)");
		
		//Scroll window horizontal
		((JavascriptExecutor)driver).executeScript("window.scroll(500,100)");
		
		
	}

}
