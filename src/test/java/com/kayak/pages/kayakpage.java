package com.kayak.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.kayak.utilites.TestBase;



public class kayakpage extends TestBase {
	Logger log=Logger.getLogger(getClass().getSimpleName());
	
	public kayakpage(WebDriver driver){
        TestBase.driver = driver;
	       //This initElements method will create all WebElements
         PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//div[@data-placeholder='From?'][@aria-label='Flight origin input']")
WebElement source;
@FindBy(xpath="//input[@placeholder='From?'][@name='origin']")
WebElement sourcename;
@FindBy(xpath = "//div[contains(text(),'San Francisco, CA')]")
//@FindBy(xpath="(//label[@class='js-multi-select-checkbox'])[1]")
WebElement sourcenameforcity;
@FindBy(xpath = "//div[@data-placeholder='To?'][@aria-label='Flight destination input']")
WebElement destination;
@FindBy(xpath="//input[@placeholder='To?'][@name='destination']")
WebElement destinationname;
@FindBy(xpath="//div[contains(text(),'Hyderabad, India')]")
//@FindBy(xpath="(//div[@class='item-info'])[1]")
WebElement destinationameforcity;
@FindBy(xpath="(//div[contains(@id,'dateRangeInput-display-start')][@aria-label='Departure date input'])[1]")
WebElement calender;
@FindBy(xpath="(//div[@id='stl-jam-cal-202008']//div[@class='_j2U _icW _icg _iq6 _ix7 _iaB _jyS _iXu _j16 _jPW _j19'][contains(text(),'3')])[1]")
 WebElement startdate;
 @FindBy(xpath = "//div[@id='stl-jam-cal-202008']//div[@class='_j2U _icW _icg _iq6 _ix7 _iaB _jyS _iXu _j16 _jPW _j19'][contains(text(),'24')]")
 WebElement returndate;
 @FindBy(xpath="(//button[@title='Search flights'])[1]")
 WebElement searchflights;
 @FindBy(xpath="//button[@aria-label='Close'][contains(@id,'covid-loading-dialog-close')]")
 WebElement popupclose;
 @FindBy(xpath = "//div[@id='UuRO']//div[@class='resultWrapper']")
 WebElement flight;
 @FindBy(xpath="(//section[contains(@id,'details-leg-details')][@class='details-section overviewSection'])[1]")
 WebElement flightdetails;
 @FindBy(xpath="(//div[@class='Flights-Results-FlightLegDetails']//span[@class='origin-destination'])[1]")
 public WebElement flighttext;
 
 public void Enter_sourceName()
 {
	 brwutil.waitElementToVisible(source);
	 source.click();
	 brwutil.waitElementToVisible(sourcename);
	 sourcename.sendKeys(System.getProperty("origin"));
	 brwutil.waitElementToVisible(sourcenameforcity);
	 sourcenameforcity.click();
	 
	 
 }
 public void Enter_destinationName()
 {
	 brwutil.waitElementToVisible(destination);
	 destination.click();
	 brwutil.waitElementToVisible(destinationname);
	destinationname.sendKeys(System.getProperty("destination"));
	 brwutil.waitElementToVisible(destinationameforcity);
	 destinationameforcity.click();
 }
 public void  Select_start_And_returndate()
 {
	 brwutil.waitElementToVisible(calender);
	 calender.click();
	 brwutil.waitElementToVisible(startdate);
	 startdate.click();
	 brwutil.waitElementToVisible(returndate);
	 returndate.click();
 }
 public void searcflights()
 {
	 brwutil.waitElementToVisible(searchflights);
	 searchflights.click();
	 brwutil.waitElementToVisible(popupclose);
	 popupclose.click();
 }
 public void select_particularflight()
 {
	 brwutil.waitElementToVisible(flight);
	 flight.click();
	 brwutil.waitElementToVisible(flightdetails);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView()",flightdetails);
	 brwutil.waitElementToVisible(flighttext);
	 }
 
        		 

}

