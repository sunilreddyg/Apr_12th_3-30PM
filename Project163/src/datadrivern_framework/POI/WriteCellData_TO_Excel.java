package datadrivern_framework.POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteCellData_TO_Excel {

	public static void main(String[] args) throws IOException {
		//Store filepath into referral variable
		String filepath="C:\\Users\\SUNIL\\git\\Apr_12th_3-30PM\\Project163\\TestData\\";
		
		//Target file location using fileinput stream  
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("File located");
		
		//Create object to access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet at book
		XSSFSheet sht=book.getSheet("Sheet1");
		
		
		//Write Cell data in existing row and existing cell.
		sht.getRow(1).getCell(3).setCellValue("MyNewPwd1");
		
		//Write cell data in existing row and New Cell
		sht.getRow(1).createCell(5).setCellValue("It's new cell");
		
		//Write cell data in NewRow and New Cell
		sht.createRow(2).createCell(0).setCellValue("It's New row");
		
		
		//Using book write cell data to new output file..
		book.write(new FileOutputStream(filepath+"Output.xlsx"));
		book.close();

	}

}
