package switchWindowsFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class windowsHandle 
{

	public static void main(String[] args) throws Exception 
	{
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  //driver.get("http://www.hdfcbank.com/");
		  driver.get("https://www.sc.com/in/bank-with-us/online-banking-login/");
		  String parentWindow = driver.getWindowHandle();
		  System.out.println("Parent Windowid :" + parentWindow);
		  driver.findElement(By.xpath("//a[@title='Apply Now']")).click();
		  
		 Set<String> multiWindows = driver.getWindowHandles();
		 Iterator<String> itr = multiWindows.iterator();
		 while(itr.hasNext())
		 {
			 String currrentWindow = itr.next();
			 System.out.println("Window id's :" + currrentWindow);
			 if(!currrentWindow.equals(parentWindow))
			 {
				 driver.switchTo().window(currrentWindow);
			 }
		 }
		 
		 String childwindowTitle = driver.getTitle();
		 System.out.println("ChildWindow Title :" + childwindowTitle);
		 driver.findElement(By.id("cities")).sendKeys("Baroda");
		 
		 driver.close();
		 
		 driver.switchTo().window(parentWindow);
		 System.out.println(driver.getTitle());
		 
		  
		 /* System.out.println(driver.getTitle());	  
		  String homeWindow=driver.getWindowHandle();
		  System.out.println("Parent Window is ... " + homeWindow);

		  Thread.sleep(2000);
		  driver.findElement(By.id("loginsubmit")).click();
		  Set<String> cWindow=driver.getWindowHandles();
		  System.out.println("Child Window is... " + cWindow.size());
		  
		  
		  Iterator<String> itr=cWindow.iterator();
		  while(itr.hasNext())
		  {
			  String currentWindowId=itr.next();
			  System.out.println("Windows are...:" + currentWindowId);
			  if(!currentWindowId.equals(homeWindow))
			  {
				  driver.switchTo().window(currentWindowId);
				  System.out.println(driver.getTitle());
			  }
		  }
		  //Thread.sleep(6000);
	
		  driver.manage().window().maximize();
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]")))).click();
		  driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]")).click();
		  //Thread.sleep(6000);
		  driver.close(); 
		  
		  driver.switchTo().window(homeWindow);
		  System.out.println(driver.getTitle());*/
		  
		 
	}
}
