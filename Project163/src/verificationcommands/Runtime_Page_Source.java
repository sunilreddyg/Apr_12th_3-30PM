package verificationcommands;

import org.openqa.selenium.WebDriver;
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
		System.out.println(Runtime_source);
		
		/*
		 * What we can verify with in pagesource:-->
		 * 			We can verify  [pageElements,Title,Url ---etc]
		 * 					
		 */
		
		

		
		

	}

}
