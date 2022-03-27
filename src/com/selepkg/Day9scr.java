package com.selepkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9scr {
	static WebDriver driver;
	static void scrShot(int i) throws IOException {
		String str = "C:\\Users\\rohan\\eclipse-workspace\\Selenium1\\Screenshot\\img"+i+".png";
		TakesScreenshot tk = (TakesScreenshot)driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File(str);
		FileUtils.copyFile(s, d);
	}
	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rohan\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	scrShot(1);
	WebElement p1 = driver.findElement(By.xpath("//input[@type='text']"));
	p1.sendKeys("Firstname1");
	scrShot(2);
	WebElement p2 = driver.findElement(By.xpath("//input[@type='password']"));
	p2.sendKeys("Pword2");
	WebElement p3 = driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']"));
	p3.click();
	scrShot(3);
	WebElement p4 = driver.findElement(By.xpath("//button[@value='1']"));
	p4.click();
	Thread.sleep(9000);
	scrShot(4);
	
}
}
