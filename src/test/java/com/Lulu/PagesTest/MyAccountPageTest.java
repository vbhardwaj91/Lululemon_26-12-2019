package com.Lulu.PagesTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Lulu.Pages.HomePage;
import com.Lulu.Pages.LoginPage;
import com.Lulu.Pages.MyAccountPage;
import com.Lulu.TestBase.TestBase;
import com.Lulu.TestUtil.GetExcelData;

public class MyAccountPageTest extends TestBase {
	
	
	    HomePage obj ;
	    LoginPage obj1;
	    MyAccountPage obj2;
	    
	    public  MyAccountPageTest(){
	    	
	    	super();
	    }
	   
	    
	    @BeforeMethod
	    
	    public void setUp(){
	    	
	    	initilizations();
	    	
	    	obj= new HomePage();
	    	obj.changeCountry();	    	
	    	obj1=obj.loginLink();
	    	try {
			obj2=	obj1.doLogin((GetExcelData.getCellData("Login", 0, 0)), GetExcelData.getCellData("Login", 0, 1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	
	    	
	    }
	    
	    @Test
	    
	    public void MyAccountTest(){
	    	
	    	obj2.NavigatePDP();
	    	
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	
	    	
	    	
	    }
	    
	    @AfterMethod
	    
	    public void tearDown(){
	    	
	    	driver.quit();
	    }
	

}
