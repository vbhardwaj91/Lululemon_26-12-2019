package com.Lulu.PagesTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Lulu.Pages.HomePage;
import com.Lulu.TestBase.TestBase;

public class HomePageTest extends TestBase {

	
	HomePage obj=null;
	
	public  HomePageTest(){
		
		super();
		
		
	}
	
	
	@BeforeMethod
	
	public void setUp(){
		
		initilizations();
		 obj= new HomePage();
		
	}
	
	@Test ( priority= 1)
	
	public void changeCountry(){
		
		obj.changeCountry();
		
		
	}
	
	
	@Test ( priority= 2)
	
    public HomePage loginLinkTest(){
		
		obj.changeCountry();
		obj.loginLink();
		
		return new HomePage();
	}
	
	@AfterMethod
	
	public void tearDown(){
		
		driver.quit();
	}
	
}
