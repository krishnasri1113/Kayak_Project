package com.kayak.utilites;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilites {
	 Logger log = Logger.getLogger(getClass().getSimpleName());
	  

	public  void launchbrowser(String  sBrowser)
	
	{
		
	  if(sBrowser.equalsIgnoreCase("ch"))
	  {
		  WebDriverManager.chromedriver().setup();
		  TestBase.driver=new ChromeDriver();
		  TestBase.driver.manage().window().maximize();
		  //TestBase.driver.get("https://www.kayak.com/flights");
		 
	  }
	  else if(sBrowser.equalsIgnoreCase("FF"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		  TestBase.driver=new FirefoxDriver();
		  TestBase.driver.manage().window().maximize();
		 
	  }
	}
	 
	public  void waitElementToVisible(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(TestBase.driver,50);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	}
