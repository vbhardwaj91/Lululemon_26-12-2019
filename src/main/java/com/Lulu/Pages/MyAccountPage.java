package com.Lulu.Pages;

import com.Lulu.TestBase.TestBase;
import com.Lulu.TestUtil.GetExcelData;
import com.Lulu.TestUtil.TestUtil;

public class MyAccountPage extends TestBase {
	
	
	public PDPPage NavigatePDP(){
		
		driver.navigate().to(GetExcelData.getCellData("PDP", 0, 0));
		
		return new PDPPage();
	}
	

}
