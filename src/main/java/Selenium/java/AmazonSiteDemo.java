package Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSiteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    String url="http://www.amazon.com/";
	    driver.get(url);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.id("nav-hamburger-menu")).click();
		//Click on Hello Sign in button
		driver.findElement(By.id("hmenu-customer-name")).click();
	}

}
