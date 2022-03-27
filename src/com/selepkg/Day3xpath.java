package com.selepkg;

import java.awt.List;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3xpath {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\rohan\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	String name = driver.getTitle();
	System.out.println(name);
	System.out.println(driver.getCurrentUrl());       
	//Thread.sleep(6000);
	WebElement p1 = driver.findElement(By.id("sign-in-icon-down"));
	p1.click();
	//Thread.sleep(6000);
	WebElement p2 = driver.findElement(By.id("signInLink"));
	p2.click();
	//List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	//Thread.sleep(8000);
	WebElement p3 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(p3);
	WebElement p4 = driver.findElement(By.xpath("//input[@type='number']"));
	String s1 = p4.getText();
	System.out.println(s1);
	p4.sendKeys("1029384999");
	//WebElement p4 = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border'])[1]"));
	//p4.click();
	//div[@class='recaptcha-checkbox-border'])
	//WebElement p3 = driver.findElement(By.xpath("//input[@id='email']"));
	//p3.sendKeys("Angolo@p.com");
	//WebElement p4 = driver.findElement(By.xpath("//input[@id='mobile']"));
	//p4.sendKeys("1273646757438");
	//WebElement p5 = driver.findElement(By.xpath("//select[@name='country']"));
	//p5.sendKeys("Belarus");
	//WebElement p6 = driver.findElement(By.xpath("//input[@id='city']"));
	//p6.sendKeys("Pune");
	//WebElement p7 = driver.findElement(By.xpath("//textarea[@name='message']"));
	//p7.sendKeys("Message Messg");
	//WebElement btnLogin = driver.findElement(By.xpath("(//button[@class='btn btn-block btn-primary']"));
	//btnLogin.click();
	//WebElement ch1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
	//ch1.click();
	//WebElement ch2 = driver.findElement(By.xpath("//input[@id='checkbox3']"));
	//ch2.click();
	//WebElement userName = driver.findElement(By.name("username"));
	//userName.sendKeys("Pune");
	//WebElement p = driver.findElement(By.name("password"));
	//p.sendKeys("check");
	//WebElement passwd = driver.findElement(By.id("location"));
	//passwd.sendKeys("Pune");
	//WebElement tx = driver.findElement(By.xpath("//div[@class='new-training__why']"));
	//String t1 = tx.getText();
	//System.out.println(t1);
	//WebElement usname = driver.findElement(By.xpath("//a[contains(text(),'Yourself')]"));
	//String t2 = usname.getAttribute("href");
	//System.out.println(t2);
	//String t3 = usname.getAttribute("class");
	//System.out.println(t3);
	//String t4 = usname.getText();
	//System.out.println(t4);
	//Thread.sleep(4000);
	//usname.click();   
	}
}
