package com.Lulu.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lulu.TestBase.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//*[@class='toggle closed']")
	WebElement ChangeCountry;
	
	@FindBy(xpath="//*[@type='search']")
	WebElement EnterCountry;
	
	@FindBy(xpath="//*[@class='search-list']/li")
	WebElement USCountry;
	
	@FindBy(xpath="//*[@class='profile-name']")
	WebElement Login;
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void changeCountry(){
		
		ChangeCountry.click();
		
		EnterCountry.sendKeys("United States");
		
		USCountry.click();
		
	}
	
	public LoginPage loginLink(){
		
		System.out.println("-------------");
		
		Login.click();
		
		return new LoginPage();
		
	}
	
}
