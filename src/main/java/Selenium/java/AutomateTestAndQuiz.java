package Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomateTestAndQuiz {

	public static void main(String[] args) {
		
		WebDriver driver=Library.launchChrome("https://www.testandquiz.com/selenium/testing.html");
		 
		//TextBox
		//driver.findElement(By.id("fname")).sendKeys("Sara");
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Sam");
	    //Submit
		driver.findElement(By.id("idOfButton")).click();
	     //radio button
		WebElement radiobutton=driver.findElement(By.xpath("//input[@name='gender'][2]"));
	    radiobutton.click();
	    System.out.println("radiobutton:"+ "male button selected" );
	}

}
