package datadrivern_framework.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Multiple_Rows_Data_From_Excel 
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
		XSSFSheet sht=book.getSheet("Sheet3");
		
		//Get Number of rows data available
		int Rcount=sht.getLastRowNum();
		System.out.println("Numer of rows data available in sheet is => "+Rcount);
		
		
		//Iterate for numbers of rows using for loop.
		for (int i = 5; i <= Rcount; i++)
		{
			 String UID=sht.getRow(i).getCell(0).getStringCellValue();
			 String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			 
			 System.out.println(UID+"   "+PWD);
			
		}
		
		
		
		
		//Get last cell number
		int LastCell_Count=sht.getRow(5).getLastCellNum();
		System.out.println("Cell Count available at row => "+LastCell_Count);
				
		
		

	}

}
