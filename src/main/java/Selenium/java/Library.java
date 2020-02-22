package Selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {

	public static WebDriver launchChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}

	public static WebDriver launchChrome(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarit\\Downloads\\chromedriver_win32\\chromedriver.exe") ;
		WebDriver temp=new ChromeDriver();
		temp.get(url);
		return temp;
	}
	
	public static void clearAndTypeValue(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);

	}
}
