package datadrivern_framework.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Target_File_location_With_TryCatch_block 
{

	public static void main(String[] args) 
	{
		
		
		//Store filepath into referral variable
		String filepath="C:\\Users\\SUNIL\\git\\Apr_12th_3-30PM\\Project163\\TestData\\InputData1.xlsx";
				
		
		try {
			
			//Target file location using fileinput stream  
			FileInputStream fi=new FileInputStream(filepath);
			System.out.println("File located");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Run Continued");
		

	}

}
