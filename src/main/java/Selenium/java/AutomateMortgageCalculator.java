package Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutomateMortgageCalculator {

	public static void main(String[] args) {
		WebDriver driver=Library.launchChrome("https://www.mortgagecalculator.org/");
		
		
		driver.findElement(By.xpath("//label[text()=' Home Value: ']/following-sibling::input")).clear();
		driver.findElement(By.xpath("//label[text()=' Home Value: ']/following-sibling::input")).sendKeys("100000");
		
		driver.findElement(By.id("downpayment")).clear();
		driver.findElement(By.id("downpayment")).sendKeys("10000");
		
		driver.findElement(By.name("param[principal]")).clear();
		driver.findElement(By.name("param[principal]")).sendKeys("90000.00"); 
		
		driver.findElement(By.xpath("(//input[@class='right-cell'])[4]")).sendKeys("2.5");
       
		driver.findElement(By.xpath("(//input[@class='right-cell'])[5]")).sendKeys("25");
       // driver.findElement(By.xpath("(//input[@class='right-cell'])[7]")).sendKeys("2500");//
	    
        WebElement startMonthElement=driver.findElement(By.name("param[start_month]"));
		Select obj=new Select(startMonthElement);
		obj.selectByVisibleText("Apr");
		
		WebElement year=driver.findElement(By.id("start_year"));
		year.sendKeys("2021");
		
		WebElement pTax=driver.findElement(By.id("pptytax"));
		pTax.sendKeys("2000");
		//driver.findElement(By.xpath("(//input[@class='right-cell'])[8]")).sendKeys("2.5");//
        //driver.findElement(By.xpath("(//input[@class='right-cell'])[9]")).sendKeys("2500");//
        //driver.findElement(By.id("hoa")).sendKeys("150");//
	
        WebElement pmi=driver.findElement(By.name("param[pmi]"));
        pmi.clear();
        pmi.sendKeys(".6");
        
        WebElement loanType=driver.findElement(By.name("param[milserve]"));
        Select selectLoanType=new Select(loanType);
        selectLoanType.selectByIndex(2);
        //selectLoanType.selectByVisibleText("FHA");//
       // selectLoanType.selectByValue(2);// 
        
        WebElement buy=driver.findElement(By.name("param[refiorbuy]"));
        Select selectBuy=new Select(buy);
        selectBuy.selectByIndex(2);
        
        WebElement creditRating=driver.findElement(By.id("credit_rating"));
        Select selectCreditRating=new Select(creditRating);
        selectCreditRating.selectByIndex(1);
        
        WebElement calcButton=driver.findElement(By.xpath(".//input[@name='cal']"));
        calcButton.click();
        //page takes time to reload.try adding catch and sleep//
    	try {
			Thread.sleep(5000);
		}
    	catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
        WebElement monthlyPayment=driver.findElement(By.xpath(".//div[@class='repayment-block']//h3"));
        String mPay=monthlyPayment.getText();
        System.out.println("Your monthlypayment is:"+mPay);
	}

	

}