package com.Lulu.TestUtil;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Lulu.TestBase.TestBase;

public class TestUtil extends TestBase{

	String Sheetname="Test";
	
    public static Workbook workbook ;
	
	public static Sheet sheet;
	
	public static Row row;
	
	public static Cell cell;
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");


	FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	
	
public static Object[][] getLoginData(String Sheetname){
		
	        FileInputStream fi = null;
		
		try {
		    fi = new FileInputStream("D:\\SeleniumAgain\\com.Lulu.Automation\\src\\main\\java\\com\\Lulu\\TestData\\Test.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			workbook=WorkbookFactory.create(fi);
		} catch (InvalidFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		sheet = workbook.getSheet(Sheetname);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()]; 
		
		for ( int i=0;i<sheet.getLastRowNum();i++){
			
			for ( int k=0;k<sheet.getRow(0).getLastCellNum();k++){
				
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				
			}
			
		}
		
		
		
		return data;
		
		
	}
	
	
	
	
}
