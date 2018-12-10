package com.Annotations;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_BrowserLaunch 
{
FirefoxDriver driver;

@BeforeTest
public void SetUp() 
{
	 driver = new FirefoxDriver();
	driver.get("http://facebook.com");
}
@Test
public void login()
{
	driver.findElementById("laddu").sendKeys("moksha");
}
}
