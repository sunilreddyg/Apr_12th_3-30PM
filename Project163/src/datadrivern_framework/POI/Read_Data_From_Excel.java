package datadrivern_framework.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel {

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
		
		//Get Cell using row referral
		XSSFCell Url_cell=row.getCell(0);
				
		//Get CellData w.r.t data format..
		String url=Url_cell.getStringCellValue();
		System.out.println("Application url is => "+url);
		
		
		//Using row referral target cell and read text
		String CustomerID=row.getCell(1).getStringCellValue();
		System.out.println("CustomerID is => "+CustomerID);
		
		
		//Read Mobile number from String Cell [Add single quote before numeric value]  => '9030248855
		String Mobile=row.getCell(2).getStringCellValue();
		System.out.println("Mobile number is => "+Mobile);
		
		
		
	}

}
