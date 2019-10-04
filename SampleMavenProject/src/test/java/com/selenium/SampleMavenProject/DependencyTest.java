package com.selenium.SampleMavenProject;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DependencyTest 
{
  @Test(priority=1)
  public void orange() 
  {
	  System.out.println("orange");
  }
  
  @Test(priority=2,dependsOnMethods= {"orange"})
  public void white() 
  {
	  System.out.println("white");
  }
  
  @Test(priority=3,dependsOnMethods= {"white"})
  public void blue() 
  {
	  System.out.println("blue");
	  throw new SkipException("skip blue Test....");
  }
  
  @Test(priority=4)
  public void green() 
  {
	System.out.println("green");  
  }
  
  
  
}
