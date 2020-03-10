package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class StepDefinition {
	WebDriver driver;
	@Given("User is on ikoala homepage")
	public void user_is_on_ikoala_homepage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "I:\\Aravinsami\\sami codes\\Cucumberkola\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ikoala.com.au/");
		driver.manage().window().maximize();
		WebElement f = driver.findElement(By.xpath("//a[@href='https://www.ikoala.com.au/login']"));
		f.click();
		
		WebElement f1 = driver.findElement(By.xpath("(//input[@name='email'])[3]"));
		f1.click();
		f1.sendKeys("aravindswaami@gmail.com");
		Thread.sleep(2000);
		
		WebElement f2 = driver.findElement(By.xpath("(//input[@name='password'])[3]"));
		f2.sendKeys("Aravind@123");
		Thread.sleep(2000);
		
		WebElement f3 = driver.findElement(By.xpath("//input[@value='Login']"));
		f3.click();
		Thread.sleep(2000);
		
	}

	@When("user search the products in search box {string}")
	public void user_search_the_products_in_search_box(String string) {
		
		WebElement f7 = driver.findElement(By.xpath("//input[@class='form-control ']"));
		f7.sendKeys(string);
	}

	@Then("user clicks the Go button")
	public void user_clicks_the_Go_button() {
		
		WebElement f8 = driver.findElement(By.xpath("//div[@class='input-group-addon btn  srchbtn']"));
		f8.click();

	}

	
	

}
