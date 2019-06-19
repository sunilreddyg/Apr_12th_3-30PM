package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_commands {

	public static void main(String[] args) throws Exception 
	{

		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript Executor at Automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
				
		//Using Javascript executor type text into editbox..
		js.executeScript("document.getElementById('u_0_l').value='Arjun'");
		js.executeScript("document.getElementById('u_0_n').value='Krishna'");
		
		
		//Javascript excutor identifying element using xpath locator..
		WebElement Email_EB=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		js.executeScript("arguments[0].value='Arjunkrishna@gmail.com'", Email_EB);
		js.executeScript("arguments[0].click()", Email_EB);
		Thread.sleep(5000);
		
		
		//Select dropdown option
		js.executeScript("document.getElementById('day').value='6'");
		js.executeScript("document.getElementById('month').value='3'");
		js.executeScript("document.getElementById('year').value='1990'");
		
		
		
		//select female radio button
		WebElement Female_radio_btn=driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
		js.executeScript("arguments[0].click()",Female_radio_btn);
		Thread.sleep(4000);
				
		//select male radio button
		WebElement male_radio_btn=driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
		js.executeScript("arguments[0].checked=true",male_radio_btn);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
