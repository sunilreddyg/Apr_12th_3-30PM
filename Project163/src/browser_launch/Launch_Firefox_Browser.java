package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser 
{

	public static void main(String[] args)
	{
		
		/*
		 * Launch Firefox browser:-->
		 * 
		 * 		=> Download geckodriver w.r.t firefox browser version
		 * 
		 * 		URL:-->  https://github.com/mozilla/geckodriver/releases
		 * 					Firefox browser version  => 65 >
		 * 					geckodriver version is   => v0.24.0
		 * 				 Download w.r.t operating systems
		 * 				 After download unzip file to project location
		 */
		
		
		//Set runtime environment variable before launching firefox browesr
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		//launch firefox browser
		FirefoxDriver firefox=new FirefoxDriver();
		//load application to empty browser window
		firefox.get("http://seleniumhq.org");

	}

}
