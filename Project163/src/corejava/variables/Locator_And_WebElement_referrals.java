package corejava.variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_And_WebElement_referrals {

	public static void main(String[] args) {
		
		//Set runtime environment variable for firefox
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		//Launch browser instance
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://facebook.com");
		//maximize browser window   [Optional]
		driver.manage().window().maximize();
		
		
		
		//Identify email editbox and type text init
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("qadarshan@gmail.com");
		
		
		//Identify password location and store into webelement referral
		WebElement Signin_password=driver.findElement(By.id("pass"));
		//Using referral variable perform actions on location
		Signin_password.clear();
		Signin_password.sendKeys("Hello12345");
		
		
		//Identify locator of login button
		By Signin_btn_locator=By.id("loginbutton");
		//Identify Sigin button
		WebElement Singin_btn=driver.findElement(Signin_btn_locator);
		Singin_btn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
