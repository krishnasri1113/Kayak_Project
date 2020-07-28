package com.kayak.stepDefinitionFile;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.kayak.pages.kayakpage;
import com.kayak.utilites.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class kayakpagesteps  extends TestBase{
	kayakpage kp;
	 Logger log = Logger.getLogger(getClass().getSimpleName());
		
	
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		brwutil.launchbrowser("ch");
		Loadconfigproperties();
		Loadlog4jproperties();
		driver.get(System.getProperty("QAEnvironmentURL"));
		log.info(System.getProperty("QAEnvironmentURL"));
		log.info("Entered the URL");
	   
	}

	@Then("^Enter the source city name$")
	public void enter_the_source_city_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoadTestdataproperties();
		Loadlog4jproperties();
		 kp=new kayakpage(driver);
		System.out.println(System.getProperty("origin"));
		kp.Enter_sourceName();
		log.info("Entered the source city");
	    
	}

	@Then("^Enter the destination city name$")
	public void enter_the_destination_city_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoadTestdataproperties();
		Loadlog4jproperties();
		kp=new kayakpage(driver);
		System.out.println(System.getProperty("destination"));
		kp.Enter_destinationName();
		log.info("Entered the destination city");
	   
	}

	@Then("^click on the calender$")
	public void click_on_the_calender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		kp=new kayakpage(driver);
		kp.Select_start_And_returndate();
	    log.info("selected the start and  end dates");
	}

	@Then("^click on search flights$")
	public void click_on_search_flights() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		kp=new kayakpage(driver);
		kp.searcflights();
		log.info("searched the flights");
	 
	}

	@Then("^click on particular flight in the flights list$")
	public void click_on_particular_flight_in_the_flights_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		kp=new kayakpage(driver);
		kp.select_particularflight();
		log.info("clicked on particular flight");
		String actualresult="SFO - HYD";
		String expeectedresult=kp.flighttext.getText();
		Assert.assertEquals(actualresult, expeectedresult);
		log.info(actualresult);
		log.info(expeectedresult);
		
	    
	}

	@Then("^quitbrowser$")
	public void quitbrowser() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit();
	   log.info("quit the browser");
	}




}
