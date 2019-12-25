package com.Lulu.Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.Lulu.TestBase.TestBase;
import com.Lulu.TestUtil.ExcelRead;
import com.Lulu.TestUtil.TestUtil;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@id='email-signin-account']")
	WebElement LoginButton;	
	
	@FindBy(xpath="//input[@id='password']")
	WebElement PwdButton;	
	
	@FindBy(xpath="//input[@id='signin-submit']")
	WebElement SignInButton;
	
    public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public MyAccountPage doLogin(String Username1 , String Pwd1) throws InterruptedException{
		
		/*System.out.println(Username1);
		System.out.println(Pwd1);
		System.out.println("----------");*/
		
		
		
		
		LoginButton.sendKeys(Username1);
		PwdButton.sendKeys(Pwd1);
		SignInButton.click();
		
		return new MyAccountPage();
		
	}
	

}
