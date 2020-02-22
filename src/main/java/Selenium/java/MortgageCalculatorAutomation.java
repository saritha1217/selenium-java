package Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MortgageCalculatorAutomation {

	public static void main(String[] args) {
	
WebDriver driver=Library.launchChrome("https://www.mortgagecalculator.org/");
		
		//driver.findElement(By.id("homeval")).clear();
		//driver.findElement(By.id("homeval")).sendKeys("1000");
		
		Library.clearAndTypeValue(driver.findElement(By.id("homeval")), "1000");
		//(//input[@class='right-cell'])[1] x path by class//
		////label[text()=' Home Value: ']//following-sibling::input xpath using //
		//driver.findElement(By.name("param[downpayment]")).clear();
		//driver.findElement(By.name("param[downpayment]")).sendKeys("100");
		WebElement downpaymentElement=driver.findElement(By.name("param[downpayment]"));
		//downpaymentElement.clear();
		Library.clearAndTypeValue(downpaymentElement, "100");
		
		WebElement startMonthElement=driver.findElement(By.name("param[start_month]"));
		Select obj=new Select(startMonthElement);
		obj.selectByVisibleText("Apr");

	}

}
