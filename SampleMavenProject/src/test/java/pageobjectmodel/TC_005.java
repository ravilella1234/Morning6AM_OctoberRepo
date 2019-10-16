package pageobjectmodel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.SampleMavenProject.BaseTest;

public class TC_005 extends  BaseTest
{
	
	@BeforeMethod
	public void startProcess() throws Exception
	{
		init();
		launch("chromebrowser");
		navigateUrl("automationurl");
	}
	
	@Test
	public void loginTest() throws Exception
	{
		LoginPage page=new LoginPage(driver);
		
		//page.loginPage();
		//Assert.assertEquals(page.loginVerify(), "Authentication failed.");
		
		PageObjectClass2 page1=new PageObjectClass2(driver);
		page1.customerRegistration();
	}
	
	@AfterMethod
	public void endProcess()
	{
		
	}

}
