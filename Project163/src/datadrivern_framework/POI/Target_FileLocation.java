package datadrivern_framework.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Target_FileLocation 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		//Store filepath into referral variable
		String filepath="C:\\Users\\SUNIL\\git\\Apr_12th_3-30PM\\Project163\\TestData\\InputData1.xlsx";
		
		//Target file location using fileinput stream  
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("File located");
		

	}

}
