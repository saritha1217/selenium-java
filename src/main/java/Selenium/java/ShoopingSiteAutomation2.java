package Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoopingSiteAutomation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		String url="http://shop.demoqa.com/";
	    WebDriver driver=new ChromeDriver();
	    driver.get(url);
	    String address=driver.findElement(By.tagName("address")).getText();
	    String telephone=driver.findElement(By.xpath(".//span[text()='T']//following-sibling::a")).getText();
	    String mailId=driver.findElement(By.xpath(".//a[@class='phone-text']")).getText();
	    System.out.println("Address="+address);
	    System.out.println("Telephone="+telephone);
	    System.out.println("MailId="+mailId);
	    driver.close();
	    
	}

}
