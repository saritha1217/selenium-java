package Selenium.java.testng;

import org.testng.annotations.Test;

import Selenium.java.Library;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;


public class FirstTestNG {
	//global variable//
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		  System.out.println("Iam running before test");
	  }
	
  @Test
  public void MyFirstTestcase() {
	System.out.println("My First Testcase is running");
	driver=Library.launchChrome("https://letskodeit.teachable.com/p/practice");
	driver.findElement(By.id("bmwradio")).click();
	
	//WebElement carType=driver.findElement//
	
	new Select(driver.findElement(By.id("carselect"))).selectByIndex(1);
	
	new Select(driver.findElement(By.xpath("//select[@name='cars']"))).selectByIndex(1);
	
	 driver.findElement(By.xpath("(//input[@name='cars' and @type='checkbox'])[1]")).click();
	 driver.findElement(By.xpath("(//input[@name='cars' and @type='checkbox'])[2]")).click();

	 
  }
  
  @Test
  public void MySecondTestcase() {
	System.out.println("My Second Testcase is running"); 
  }
  //this function will run before all the testcases start running//
 

  @AfterTest
  public void afterTest() {
	  System.out.println("Iam running after test");
	 // driver.close();//
  }

}
