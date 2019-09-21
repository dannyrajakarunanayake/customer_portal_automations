package com.customer.portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PlanCreationTest {
	
	private WebDriver driver;
	
	public PlanCreationTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void loginTest() throws InterruptedException {	
		
		driver.get("https://payrighttestmerchant.payright.com.au");
		System.out.println("page opened");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		driver.findElement(By.name("username")).sendKeys("Yash");
		driver.findElement(By.name("password")).sendKeys("Yash123");	
		driver.findElement(By.name("button")).click();
	
	}	
	
	@Test
	public void planCreationTest() throws InterruptedException {
		WebElement newplan = driver.findElement(By.xpath("//*[@id=\"menu-primary\"]/li[1]/a"));
		newplan.click();
		
		WebElement title =driver.findElement(By.id("salutation"));
		Select select = new Select(title);
		select.selectByValue("Mr.");
		
		driver.findElement(By.name("first_name")).sendKeys("rahul");
		driver.findElement(By.name("last_name")).sendKeys("singh");
		driver.findElement(By.name("email1")).sendKeys("qa.testing143+01@gmail.com");
		driver.findElement(By.name("email2")).sendKeys("qa.testing143+01@gmail.com");
		driver.findElement(By.name("phone_mobile")).sendKeys("0426245322");
		driver.findElement(By.xpath("//*[@id=\"date_of_birth\"]")).click();
		
		WebElement dateofbirth =driver.findElement(By.className("ui-datepicker-month"));
		Select select1 = new Select(dateofbirth);
		select1.selectByValue("3"); 
		
		
		WebElement date_of_birth =driver.findElement(By.className("ui-datepicker-year"));
		Select select2 = new Select(date_of_birth);
		select2.selectByValue("1983");
			
	    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a")).click();
		Thread .sleep(3000);
		
	    driver.findElement(By.xpath("//*[@id=\"sale_amount\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"sale_amount\"]")).sendKeys("$1000");	
	}
}


	
	
	