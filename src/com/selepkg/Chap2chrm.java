package com.selepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chap2chrm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\rohan\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	String name = driver.getTitle();
	System.out.println(name);
	System.out.println(driver.getCurrentUrl());
	//WebElement usname = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
	//usname.sendKeys("Greens-Technology");
	WebElement userName = driver.findElement(By.name("username"));
	userName.sendKeys("Pune");
	WebElement p = driver.findElement(By.name("password"));
	p.sendKeys("check");
	//WebElement passwd = driver.findElement(By.id("location"));
	//passwd.sendKeys("Pune");
	//WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	//btnLogin.click();
	}
}
