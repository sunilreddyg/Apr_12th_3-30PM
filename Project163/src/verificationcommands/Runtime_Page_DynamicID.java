package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Page_DynamicID {

	public static void main(String[] args) 
	{
		

		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Get Current browser window dynamic ID
		String Window_DynamicID=driver.getWindowHandle();
		System.out.println(Window_DynamicID);
		
		
		/*
		 * Note:-->
		 * 			Dynamic Window ID helps to switch between different windows
		 */
		
		

	}

}
