package Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MortgageCalculatorAutomation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=Library.launchChrome("https://www.mortgagecalculator.org/");
	    //homevalue//
		driver.findElement(By.name("param[homevalue]")).sendKeys("10000");
		//downpayment//
		driver.findElement(By.id("downpayment")).sendKeys("2000");
        //loanamount//
		driver.findElement(By.name("param[principal]")).clear();
		driver.findElement(By.name("param[principal]")).sendKeys("98000.00");
	    
	}
}