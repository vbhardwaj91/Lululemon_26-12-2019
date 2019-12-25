package com.Lulu.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Lulu.TestBase.TestBase;

public class PDPPage extends TestBase {

	
	@FindBy(xpath="//img[@alt='black color swatch']")
	WebElement swatch;
	
	@FindBy(xpath="//label[@class='select-menu__label']")
	WebElement Dropdown;
	
	@FindBy(xpath="//*[@id='customSize']/li[2]/div")
	WebElement Sku;
	
	@FindBy(xpath="//button[contains(@class,'add-to-bag buttonPrimary')]")
	WebElement AddtoCart;
	
	public PDPPage(){
		
		PageFactory.initElements(driver, this);

	}
	
	public void AddtoCart(){
		
		swatch.click();
		Select s = new Select(Dropdown);
		s.selectByValue("2");
		AddtoCart.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
