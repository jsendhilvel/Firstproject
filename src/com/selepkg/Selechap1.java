package com.selepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selechap1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\rohan\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		String name = driver.getTitle();
		System.out.println(name);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.quit();			
	
}
}
	