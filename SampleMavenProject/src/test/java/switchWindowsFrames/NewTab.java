package switchWindowsFrames;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTab {

WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	
	
	@Test
	public void testNewTab() throws InterruptedException
	{
		
		driver.get("http://www.google.com");
		WebElement links1=driver.findElement(By.linkText("Gmail"));
		
		Actions a=new Actions(driver);
		a.moveToElement(links1).keyDown(Keys.CONTROL).click(links1).build().perform();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	
}
