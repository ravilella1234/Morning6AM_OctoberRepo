package com.selenium.SampleMavenProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LinksTesting1 extends BaseTest
{
	
	@BeforeMethod(groups= {"regression"})
	@Parameters("browser")
	public void setup(String bType) throws Exception
	{
		init();		
		launch(bType);
		navigateUrl("googleurl");
	}
	
	
	@Test(groups= {"regression"})
	public void linktesting1()
	
	 {
		String expval="Google Images";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod(groups= {"regression"})
	public void tearDown()
	{
		 browserClose();
	}

}
