package com.BrowserApplication;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Login {

	public static void main(String[] args) 
	{
		
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://newtours.demoaut.com");
driver.findElementByName("userName").sendKeys("tutorial");
driver.findElementByName("password").sendKeys("tutorial");
driver.findElementByName("login").click();

	}

}
