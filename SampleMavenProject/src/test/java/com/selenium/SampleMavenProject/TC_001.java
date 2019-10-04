package com.selenium.SampleMavenProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TC_001 extends BaseTest
{
 
  @BeforeMethod(groups= {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  {
	  System.out.println("start test");
	  	test=report.startTest("TC_001");
		
		init();
		test.log(LogStatus.INFO, "Initializing the properties files........");
		
		launch(bType);
		test.log(LogStatus.PASS, "Launched the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to URL : " + p.getProperty("amazonurl"));
  }
  
  
  @Test(groups= {"regression","sanity"})
  public void amazon() 
  {
	    System.out.println("iam amazon test");
	  
	    selectItem("amazondropbox_id","Books");	
		test.log(LogStatus.PASS, "Selected the item Books by using the locator : " + or.getProperty("amazondropbox_id"));
		
		type("amazonsearchtextbox_id","Harry Potter");
		test.log(LogStatus.PASS, "Entered the text Harry Potter by using the locator : " + or.getProperty("amazonsearchtextbox_id"));
			
		click("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on Amazon Search Button by using locator : " + or.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups= {"regression","sanity"})
  public void endProcess()
  {
	  System.out.println("end Test");
	  
	  browserClose();
	  
	  report.endTest(test);
	  report.flush();
  }

}
