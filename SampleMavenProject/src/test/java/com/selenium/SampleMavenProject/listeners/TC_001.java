package com.selenium.SampleMavenProject.listeners;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.selenium.SampleMavenProject.BaseTest;

public class TC_001 extends BaseTest
{
	@BeforeMethod
	@Parameters("browser")
	public void startProcess(String bType) throws Exception
	{
		init();
	    Reporter.log("Initializing the properties files........");
		
		launch(bType);
		Reporter.log("Launched the Browser : " + bType);
		
		navigateUrl("amazonurl");
		Reporter.log("Navigated to URL : " + p.getProperty("amazonurl"));
		
	}
	
	
  @Test
  @Parameters("browser")
  public void amazonTest() throws Exception 
  {
		selectItem("amazondropbox_id","Books");	
		Reporter.log( "Selected the item Books by using the locator : " + or.getProperty("amazondropbox_id"));
		
		type("amazonsearchtextbox_id","Harry Potter");
		Reporter.log("Entered the text Harry Potter by using the locator : " + or.getProperty("amazonsearchtextbox_id"));
			
		click("amazonsearchbutton_xpath");
		Reporter.log("Clicked on Amazon Search Button by using locator : " + or.getProperty("amazonsearchbutton_xpath"));	
  }
  
  @AfterMethod
  public void endProcess()
  {
	  browserClose();
  }
  
}
