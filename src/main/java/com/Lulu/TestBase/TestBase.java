package com.Lulu.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties Config;
	
	
	public TestBase(){
		
		
		Config = new Properties();
		FileInputStream fi = null;
		
		try {
			fi= new FileInputStream((System.getProperty("user.dir")+"\\src\\main\\java\\com\\Lulu\\Config\\Config.Properties"));
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			Config.load(fi);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void initilizations(){
		
		String Browser = Config.getProperty("Browser");
		
		
		if (Browser.equalsIgnoreCase("Chrome")){	
			System.out.println(Browser);	
			System.setProperty("webdriver.chrome.driver",
					"D:\\SeleniumAgain\\com.LululemonAutomation\\src\\test\\resources\\drivers\\chromedriverLatest.exe");
			
			
			System.out.println(Browser);	
			driver = new ChromeDriver();
			
		}
		
		else if (Config.getProperty("Browser").equalsIgnoreCase("IE")){
		
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
				
		}
		
		driver.manage().window().maximize();
		driver.get(Config.getProperty("URL"));
		
	}
	
	
	
	
	
	
	
	
	
	
}
