package datadrivern_framework.POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_For_WebDriver_Testcase {

	public static void main(String[] args) throws IOException {
		
		//Store filepath into referral variable
		String filepath="C:\\Users\\SUNIL\\git\\Apr_12th_3-30PM\\Project163\\TestData\\InputData.xlsx";
		
		//Target file location using fileinput stream  
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("File located");
		
		//Create object to access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet at book
		XSSFSheet sht=book.getSheet("Sheet2");
		
		//Target row using above sheet
		XSSFRow row=sht.getRow(6);
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Get URl From Excel
		String Appurl=row.getCell(0).getStringCellValue();
		driver.get(Appurl);
		
		//Get Singin button xpath from excel
		String locator_Singin_btn=row.getCell(1).getStringCellValue();
		driver.findElement(By.xpath(locator_Singin_btn)).click();
		
		//Get Email Locator and xpath from excel
		String Locator_Email_EB=row.getCell(2).getStringCellValue();
		String Input_Email_EB=row.getCell(3).getStringCellValue();
		driver.findElement(By.xpath(Locator_Email_EB)).clear();
		driver.findElement(By.xpath(Locator_Email_EB)).sendKeys(Input_Email_EB);
		
		//Get Email Validation next button xpath from excel
		String Locator_Email_Next_btn=row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(Locator_Email_Next_btn)).click();
		
		

	}

}
