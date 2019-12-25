package com.Lulu.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	
	public static Workbook workbook ;
	
	public static Sheet sheet;
	
	public static Row row;
	
	public static Cell cell;
	
	public static FileInputStream fi;
	
	public static int  rowCount;
	
	public static int  colCount;
	
	public int sheetno;
	

	public ExcelRead(String PathName)  {

		
		
		
		
		
		try {
			fi = new FileInputStream(PathName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			 workbook=WorkbookFactory.create(fi);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
	}
	
	
	
	public int getRowCount(int SheetNumber){
		
		sheet = workbook.getSheetAt(SheetNumber);
		
	    this.rowCount = sheet.getLastRowNum();
	    
	    return rowCount;
		
	}
	
	
    public int getRowCount(String SheetName){
		
		sheet = workbook.getSheet(SheetName);
		
	    this.rowCount = sheet.getLastRowNum();
	    
	    return rowCount;
		
	}
	
		
	
	// System.out.println("Row Counts are "+ sheet.getLastRowNum());
		
		// rowCount= sheet.getLastRowNum();
		
	
	public int getColCount(){
		
		
		row = sheet.getRow(0);
		
		cell = row.getCell(0);
		
		this.colCount= row.getLastCellNum();
		
		return colCount;
		
	}
	
	
	public static Object excelRead(int sheetno , int Rowno, int Colno){
		
		sheet = workbook.getSheetAt(sheetno);
		
		 row= sheet.getRow(Rowno);
		
		
		
			
		Cell	cell = row.getCell(Colno);
			
			switch (cell.getCellType())
			
			{
				
			
			case Cell.CELL_TYPE_STRING:
				
			
				
				
				String str=cell.getStringCellValue();
				
				
				
				return str;
			
			    
			
			case Cell.CELL_TYPE_NUMERIC :
			
			
				
				System.out.println("Int");
				
				int intData=(int) cell.getNumericCellValue();
				
				
				
				return intData;
			
			
				
			default :
				
				return "  ";
			

		}
			

		}
	
	
	
      public static Object excelRead(String Sheetname , int Rowno, int Colno){
		
		sheet = workbook.getSheet(Sheetname);
		
		 row= sheet.getRow(Rowno);
		
		
		
			
		Cell	cell = row.getCell(Colno);
			
			switch (cell.getCellType())
			
			{
				
			
			case Cell.CELL_TYPE_STRING:
				
			
				System.out.println("String");
				
				String str=cell.getStringCellValue();
				
				
				
				return str;
			
			    
			
			case Cell.CELL_TYPE_NUMERIC :
			
			
				
				System.out.println("Int");
				
				int intData=(int) cell.getNumericCellValue();
				
				
				
				return intData;
			
			
				
			default :
				
				return "  ";
			

		}
			

		}
	
	
	
		
		}
		
		
		
		
		
		
		
		
		
	
	
		