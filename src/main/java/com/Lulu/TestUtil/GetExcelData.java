package com.Lulu.TestUtil;

public class GetExcelData {

	
	
	
	public static String getCellData(String SheetName , int i , int j){
		
		Object[][] data= TestUtil.getLoginData(SheetName);
		
		String Data = data[i][j].toString();
		
		return Data;
		
	}
	
}

