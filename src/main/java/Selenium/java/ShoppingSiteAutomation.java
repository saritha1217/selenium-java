package Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSiteAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarit\\Downloads\\chromedriver_win32\\chromedriver.exe");
    String url="http://shop.demoqa.com/";
    WebDriver driver=new ChromeDriver();
    driver.get(url);
    WebElement message=driver.findElement(By.xpath("/html/body/p"));
    System.out.println(message.getText());
   // driver.findElement(By.xpath("/html/body/p/a")).click();//
	driver.findElement(By.className("woocommerce-store-notice_dismissal-link")).click();
	}

}
