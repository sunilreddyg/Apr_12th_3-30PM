package datadrivern_framework.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.management.monitor.StringMonitor;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_NumericCellValue 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Store filepath into referral variable
		String filepath="C:\\Users\\SUNIL\\git\\Apr_12th_3-30PM\\Project163\\TestData\\InputData.xlsx";
		
		//Target file location using fileinput stream  
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("File located");
		
		//Create object to access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet at book
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target row using above sheet
		XSSFRow row=sht.getRow(1);
		
		//Using row target cell
		XSSFCell Mobile_Numeric_Cell=row.getCell(4);
		
		Double MobileNum=Mobile_Numeric_Cell.getNumericCellValue();
		System.out.println("Mobile number in double format is => "+MobileNum);
		
		//COnvert double value in numeric format.
		long Num_mobileNum=MobileNum.longValue();
		System.out.println("Mobile number in numeric format is => "+Num_mobileNum);
		
		
		
		//Convert double cell value into text
		String string_mobilenum=NumberToTextConverter.toText(MobileNum);
		System.out.println("Mobile number in string format is => "+string_mobilenum);
		
		
		
	}

}
