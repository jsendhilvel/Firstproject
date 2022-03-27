package com.selepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selech1ie {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", 
				"C:\\Users\\rohan\\eclipse-workspace\\Selenium1\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com/");
		String name = driver.getTitle();
		System.out.println(name);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.quit();			
		
}
}
	