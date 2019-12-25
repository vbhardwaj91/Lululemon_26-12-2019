package com.Lulu.PagesTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Lulu.Pages.HomePage;
import com.Lulu.Pages.LoginPage;
import com.Lulu.TestBase.TestBase;
import com.Lulu.TestUtil.TestUtil;

public class LoginPageTest extends TestBase {

    HomePage obj;
    LoginPage obj1;
   
	
	public  LoginPageTest(){
		
		super();
		
		
	}
		
	@BeforeMethod
	
	public void setUp(){
		
		 initilizations();	 
		 obj= new HomePage();
		 obj.changeCountry();
		obj1=obj.loginLink();
		  
		
		
	}
	
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data=TestUtil.getLoginData("Test");
		
		return data;
	}
	
	
	@Test ( dataProvider="getData")
	
	public void doLoginTest(String Username, String Pwd) throws InterruptedException{
		
		obj1.doLogin(Username, Pwd);
		
		
	}
	
    @AfterMethod
	
	public void tearDown(){
		
		driver.quit();
	}
}
