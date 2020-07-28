package com.kayak.utilites;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
			

public class TestBase {
	public static WebDriver driver=null;
	 public static BrowserUtilites brwutil=new BrowserUtilites();
	 public static commonUtilites commonutil=new commonUtilites();
	//public static String sclassNameForScreenShot="";
	 Logger log=Logger.getLogger(getClass().getSimpleName());
	

	public  void LoadTestdataproperties() throws Exception
	{
		
		commonutil.loadPropertyfiles(System.getProperty("user.dir")+"/src/main/resources/Properties/TestData.properties");
		
		
	}
	public  void Loadconfigproperties() throws Exception
	{
		commonutil.loadconfigproperties(System.getProperty("user.dir")+"/src/main/resources/Properties/Config.properties");
	}
public void Loadlog4jproperties() throws Exception
{
	commonutil.loadlog4jproperties(System.getProperty("user.dir")+"/src/main/resources/Properties/Log4j.properties");
}
	
	

}
